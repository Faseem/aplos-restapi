package com.aplos.service;

import com.aplos.common.dto.ResponseDto;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Aux072 on 28/05/2018.
 */
public interface CustomerService {
    public ResponseDto getCustomerByCityIdByClientId(Long cityId, Long clientId);
    public ResponseDto getCustomerCountByCityIdByCityId(Long cityId, Long clientId);
    public ResponseDto getAllPaginatedCustomersForCityIdClientId(Long cityId, Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order);
    public ResponseDto getCustomerSalesInforByCustomerId(Long customerId);
    public ResponseDto getAllCustomersByClientId(Long clientId);
}
