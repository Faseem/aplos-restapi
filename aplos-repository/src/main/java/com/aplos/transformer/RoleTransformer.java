package com.aplos.transformer;

import com.aplos.common.dto.RoleDto;
import com.aplos.domain.Role;
import org.springframework.stereotype.Service;

import java.util.stream.BaseStream;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class RoleTransformer implements BaseTransformer<Role, RoleDto> {
    @Override
    public RoleDto transform(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setRoleId(role.getRoleId());
        roleDto.setRoleName(role.getRoleName());
        role.setRoleDescription(role.getRoleDescription());
        return roleDto;
    }

    @Override
    public Role reverseTransform(RoleDto roleDto) {
        Role role = new Role();
        role.setRoleId(roleDto.getRoleId());
        role.setRoleName(roleDto.getRoleName());
        role.setRoleDescription(roleDto.getRoleDescription());
        return role;
    }
}
