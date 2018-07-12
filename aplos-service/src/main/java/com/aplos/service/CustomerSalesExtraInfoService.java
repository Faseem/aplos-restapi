package com.aplos.service;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.common.dto.ResponseDto;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Aux072 on 02/06/2018.
 */
public interface CustomerSalesExtraInfoService {
    public ResponseDto getCustomerSalesInforByCustomerId(Long customerId);
    public ResponseDto addCustomerSalesExtraInfo(@RequestBody CustomerSalesExtraInfoDto customerSalesExtraInfoDto);
}
