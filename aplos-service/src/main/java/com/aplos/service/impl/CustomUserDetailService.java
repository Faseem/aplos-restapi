
package com.aplos.service.impl;

import com.aplos.domain.User;
import com.aplos.service.UserService;
import com.aplos.service.util.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	UserService userService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = (User) userService.findUserByUsername(username).getResponseDto();
		if (user == null) {
			throw new UsernameNotFoundException(String.format("Username [%s] not found.", username));
		}
		return new SecurityUser(user);
	}

}
