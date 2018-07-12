package com.aplos.service;

import com.aplos.common.dto.ResponseDto;

/**
 * Created by Aux072 on 18/04/2018.
 */
public interface UserService {
    ResponseDto findUserByUsername(String username);
    ResponseDto  getPrivilegesByUserId(Long userId);
    ResponseDto  validateUser(String username);
    ResponseDto  getUserClient(Long userId);
    ResponseDto  getAllUsers(Integer startFrom, Integer numberOfRecordNeed, String order);
    public ResponseDto getAllUsersByClientId(Long clientId);
}
