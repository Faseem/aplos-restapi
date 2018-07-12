package com.aplos.transformer;

import com.aplos.common.dto.UserDto;
import com.aplos.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 18/04/2018.
 */
@Service
public class UserTransformer implements BaseTransformer<User, UserDto> {
    @Override
    public UserDto transform(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setPassword(user.getPassword());
        userDto.setUsername(user.getUsername());
        userDto.setUserCreatedDate(user.getUserCreatedDate());
        userDto.setUserEmail(user.getUserEmail());
        userDto.setUserImagePath(user.getUserImagePath());
        userDto.setUserIsActive(user.getUserIsActive());
        userDto.setUserTelnumberOne(user.getUserTelnumberOne());
        userDto.setUserTelnumberTwo(user.getUserTelnumberTwo());
        return userDto;
    }

    @Override
    public User reverseTransform(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setUsername(userDto.getUsername());
        user.setUserCreatedDate(userDto.getUserCreatedDate());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserImagePath(userDto.getUserImagePath());
        user.setUserIsActive(userDto.getUserIsActive());
        user.setUserTelnumberOne(userDto.getUserTelnumberOne());
        user.setUserTelnumberTwo(userDto.getUserTelnumberTwo());
        return user;
    }
}
