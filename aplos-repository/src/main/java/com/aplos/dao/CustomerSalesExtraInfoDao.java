package com.aplos.dao;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.domain.CustomerSalesExtraInfo;

/**
 * Created by Aux072 on 02/06/2018.
 */
public interface CustomerSalesExtraInfoDao extends BaseDao<CustomerSalesExtraInfo> {

    public CustomerSalesExtraInfoDto getCustomerSalesInforByCustomerId(Long customerId);
    public CustomerSalesExtraInfoDto addCustomerSalesExtraInfoDto(CustomerSalesExtraInfoDto customerSalesExtraInfoDto);
    /*public CustomerSalesExtraInfoDto updateCustomerSalesExtraInfoDto(CustomerSalesExtraInfoDto customerSalesExtraInfoDto);*/

}
