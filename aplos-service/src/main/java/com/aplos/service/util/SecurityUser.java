package com.aplos.service.util;

import com.aplos.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by Aux072 on 18/04/2018.
 */
public class SecurityUser extends User implements UserDetails {
    public SecurityUser(User user){
        if(user !=null){
            this.setUserId(user.getUserId());
            this.setUsername(user.getUsername());
            this.setPassword(user.getPassword());
        }
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
     */
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
     */
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
     */
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
     */
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
     */
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
}
