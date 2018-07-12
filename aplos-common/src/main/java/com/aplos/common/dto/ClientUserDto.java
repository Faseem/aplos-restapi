package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 24/04/2018.
 */
public class ClientUserDto implements Serializable {
    private static final long serialVersionUID = 5820008157862853492L;

    private Long clientUserId;
    private ClientDto client;
    private UserDto user;


}
