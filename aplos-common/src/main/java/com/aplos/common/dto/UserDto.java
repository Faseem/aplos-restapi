package com.aplos.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aux072 on 18/04/2018.
 */
public class UserDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long userId;
    private String username;
    private String password;
    private String userEmail;
    private String userTelnumberOne;
    private String userTelnumberTwo;
    private String userImagePath;
    private Boolean userIsActive;
    private Date userCreatedDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelnumberOne() {
        return userTelnumberOne;
    }

    public void setUserTelnumberOne(String userTelnumberOne) {
        this.userTelnumberOne = userTelnumberOne;
    }

    public String getUserTelnumberTwo() {
        return userTelnumberTwo;
    }

    public void setUserTelnumberTwo(String userTelnumberTwo) {
        this.userTelnumberTwo = userTelnumberTwo;
    }

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }

    public Boolean getUserIsActive() {
        return userIsActive;
    }

    public void setUserIsActive(Boolean userIsActive) {
        this.userIsActive = userIsActive;
    }

    public Date getUserCreatedDate() {
        return userCreatedDate;
    }

    public void setUserCreatedDate(Date userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }
}
