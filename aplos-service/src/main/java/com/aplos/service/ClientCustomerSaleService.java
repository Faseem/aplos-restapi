package com.aplos.service;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.common.dto.ResponseDto;

import java.util.Date;

/**
 * Created by Aux072 on 05/06/2018.
 */
public interface ClientCustomerSaleService {
    public ResponseDto addClientCustomerSale(ClientCustomerSaleDto clientCustomerSaleDto);
    public ResponseDto getAllSalesForCustomerIdClientId(Long clientId,
                                                        Long customerId,
                                                        Boolean isOmitSettled,
                                                        Date startDate,
                                                        Date endDate,
                                                        Integer startFrom,
                                                        Integer numberOfRecordNeed,
                                                        String order);

    public ResponseDto getCountForClientCustomerSale(Long clientId,
                                                        Long customerId,
                                                        Boolean isOmitSettled,
                                                        Date startDate,
                                                        Date endDate);

    public ResponseDto getAllSalesForUserIdClientId(Long clientId,
                                                        Long userId,
                                                        Boolean isOmitSettled,
                                                        Date startDate,
                                                        Date endDate,
                                                        Integer startFrom,
                                                        Integer numberOfRecordNeed,
                                                        String order);

    public ResponseDto getCountForClientUserSale(Long clientId,
                                                     Long userId,
                                                     Boolean isOmitSettled,
                                                     Date startDate,
                                                     Date endDate);

    public ResponseDto getClientCustomerSale(Long clientId,
                                                 Long customerId,
                                                 Long saleId);

}
