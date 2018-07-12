package com.aplos.service.impl;

import com.aplos.common.dto.ClientDto;
import com.aplos.common.dto.PrivilageDto;
import com.aplos.common.dto.ResponseDto;
import com.aplos.common.dto.UserDto;
import com.aplos.common.dto.com.aplos.common.constants.MessageConstants;
import com.aplos.dao.UserDao;
import com.aplos.dao.impl.BaseDaoImpl;
import com.aplos.domain.User;
import com.aplos.service.UserService;
import com.aplos.service.bl.UserServiceBL;
import com.aplos.service.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aux072 on 18/04/2018.
 */
@Service
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;

    @Autowired
    ServiceUtil serviceUtil;

    @Autowired
    UserServiceBL userServiceBL;

    /*
	 * (non-Javadoc)
	 *
	 * @see com.camelot.service.UserService#findUserByUsername(java.lang.String)
	 */
    public ResponseDto findUserByUsername(String username) {
        LOGGER.info("UserServiceImpl.findUserByUsername(username) execution started.");
        ResponseDto responseDto = null;
        try {
            User user = userDao.getUserByUsername(username);
            if (user != null) {
                LOGGER.info("User information received for given username [{}]", username);
                responseDto = serviceUtil.getServiceResponse(user);
            } else {
                LOGGER.info("Unambe to receive the user information for the given username [{}]", username);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_USERS_NOT_FOUND);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the user details for given username [{}]", username);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_USER_RETRIEVE);
        }
        return responseDto;
    }

    public ResponseDto getPrivilegesByUserId(Long userId) {
        LOGGER.info("UserServiceImpl.getPrivilegesByUserId(userId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<PrivilageDto> privilageDtos = userDao.getPrevilagesByUserId(userId);
            if (privilageDtos != null) {
                LOGGER.info("Previlage information received for given userId [{}]", userId);
                responseDto = serviceUtil.getServiceResponse(privilageDtos);
            } else {
                LOGGER.info("Unable to receive the privilage information for the given userid [{}]", userId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_USER_PRIVILAGE);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the user previlage details for given userid [{}]", userId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_USER_PRIVILAGE);
        }
        return responseDto;
    }

    public ResponseDto  validateUser(String username) {
        LOGGER.info("UserServiceImpl.validateUser(username) execution started.");
        ResponseDto responseDto = null;
        try {
            UserDto userDto= userDao.validateUser(username);
            if (userDto != null) {
                LOGGER.info("Previlage information received for given username [{}]", username);
                responseDto = serviceUtil.getServiceResponse(userDto);
            } else {
                LOGGER.info("Unable to receive the User information for the given ussername [{}]", username);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_ACTIVE_USER);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the acive user for given username [{}]", username);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_ACTIVE_USER);
        }
        return responseDto;
    }

    public ResponseDto getUserClient(Long userId) {
        LOGGER.info("UserServiceImpl.getUserClient(userId) execution started.");
        ResponseDto responseDto = null;
        try {
            ClientDto clientDto = userDao.getUserClient(userId);
            if (clientDto != null) {
                LOGGER.info("Client information received for given userId [{}]", userId);
                responseDto = serviceUtil.getServiceResponse(clientDto);
            } else {
                LOGGER.info("Unable to receive the client information for the given userid [{}]", userId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_USER_CLIENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the user client details for given userid [{}]", userId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_USER_CLIENT);
        }
        return responseDto;
    }

    public ResponseDto getAllUsers(Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("UserServiceImpl.getAllUsers(Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");
        ResponseDto responseDto = null;
        try {
            List<UserDto> userDtos = userDao.getAllUsers(startFrom, numberOfRecordNeed, order);
            if (userDtos != null) {
                LOGGER.info("Users information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil.getServiceResponse(userDtos);
            } else {
                LOGGER.info("Users information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                        startFrom, numberOfRecordNeed,order);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_USER_CLIENT);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving theUsers information received for given parameters startfrom [{}], numberOfRecordNeed [{}], order [{}]",
                    startFrom, numberOfRecordNeed,order);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_USER_CLIENT);
        }
        return responseDto;
    }

    public ResponseDto getAllUsersByClientId(Long clientId) {
        LOGGER.info("UserServiceImpl.getUserClient(userId) execution started.");
        ResponseDto responseDto = null;
        try {
            List<UserDto> userDtos = userDao.getAllUsersByClientId(clientId);
            if (userDtos != null) {
                LOGGER.info("users received for given clientId [{}]", clientId);
                responseDto = serviceUtil.getServiceResponse(userDtos);
            } else {
                LOGGER.info("Unable to receive the  the users for given clientId [{}]", clientId);
                responseDto = serviceUtil
                        .getErrorServiceResponse(MessageConstants.ServiceErrorMessages.ERR_RETRIEVE_CLIENT_USERS);
            }

        } catch (Exception e) {
            LOGGER.info("Exception occurs while receiving the users for given clientId [{}]", clientId);
            responseDto = serviceUtil
                    .getExceptionServiceResponseByProperties(MessageConstants.ServiceErrorMessages.EX_RETRIEVE_CLIENT_USERS);
        }
        return responseDto;
    }
}
