package com.aplos.controller;

import com.aplos.common.dto.ResponseDto;
import com.aplos.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aux072 on 24/04/2018.
 */
@RestController
@RequestMapping("/user")
public class UserController  {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getPrivilegesByUserId", method = RequestMethod.GET)
    public ResponseDto getPrivilegesByUserId(@RequestParam("user_id") Long userId) {
        LOGGER.info(
                "UserController.findRolesByUserId(Long {} ) invoked.",userId);
        return userService.getPrivilegesByUserId(userId);
    }

    @RequestMapping(value = "/validateUser", method = RequestMethod.GET)
    public ResponseDto validateUser(@RequestParam("username") String username) {
        LOGGER.info(
                "UserController.validateUser(String {} ) invoked.",username);
        return userService.validateUser(username);
    }

    @RequestMapping(value = "/getUserClient", method = RequestMethod.GET)
    public ResponseDto getUserClient(@RequestParam("user_id") Long userId) {
        LOGGER.info(
                "UserController.getUserClient(Long {} ) invoked.",userId);
        return userService.getUserClient(userId);
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public ResponseDto getAllUsers(@RequestParam("startFrom") Integer startFrom,
                                   @RequestParam("numberOfRecordNeed") Integer numberOfRecordNeed,
                                   @RequestParam("order") String order) {
        LOGGER.info(
                "UserController.getAllUsers(Integer {}, Integer{}, String {} ) invoked.",startFrom, numberOfRecordNeed, order);
        return userService.getAllUsers(startFrom, numberOfRecordNeed, order);
    }

    @RequestMapping(value = "/getAllUsersByClientId", method = RequestMethod.GET)
    public ResponseDto getAllUsers(@RequestParam("client_id") Long clientId) {
        LOGGER.info(
                "UserController.getAllUsersByClientId(Long{}) invoked.",clientId);
        return userService.getAllUsersByClientId(clientId);
    }
}
