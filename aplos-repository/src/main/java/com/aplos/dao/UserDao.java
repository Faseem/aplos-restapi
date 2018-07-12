package com.aplos.dao;

import com.aplos.common.dto.ClientDto;
import com.aplos.common.dto.PrivilageDto;
import com.aplos.common.dto.UserDto;
import com.aplos.domain.Privilage;
import com.aplos.domain.User;

import java.util.List;

/**
 * Created by Aux072 on 18/04/2018.
 */
public interface UserDao extends BaseDao<User>  {
    public User getUserByUsername(String username);
    public List<PrivilageDto> getPrevilagesByUserId(Long userId);
    public UserDto validateUser(String username);
    public ClientDto getUserClient(Long userId);
    public List<UserDto> getAllUsers(Integer startFrom, Integer numberOfRecordNeed, String order);
    public UserDto getUserByUserId(Long userId);
    public List<UserDto> getAllUsersByClientId(Long clientId);
}
