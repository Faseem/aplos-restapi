package com.aplos.transformer;

import com.aplos.common.dto.PrivilageDto;
import com.aplos.domain.Privilage;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 24/04/2018.
 */
@Service
public class PrivilageTransformer implements BaseTransformer<Privilage, PrivilageDto> {
    @Override
    public PrivilageDto transform(Privilage privilage) {
        PrivilageDto privilageDto = new PrivilageDto();
        privilageDto.setPrivilageId(privilage.getPrivilageId());
        privilageDto.setPrivilageCode(privilage.getPrivilageCode());
        privilageDto.setPrivilageDescription(privilage.getPrivilageDescription());
        privilageDto.setPrivilageName(privilage.getPrivilageName());
        return privilageDto;
    }

    @Override
    public Privilage reverseTransform(PrivilageDto privilageDto) {
        Privilage privilage = new Privilage();
        privilage.setPrivilageId(privilageDto.getPrivilageId());
        privilage.setPrivilageCode(privilageDto.getPrivilageCode());
        privilage.setPrivilageDescription(privilageDto.getPrivilageDescription());
        privilage.setPrivilageName(privilageDto.getPrivilageName());
        return privilage;
    }
}
