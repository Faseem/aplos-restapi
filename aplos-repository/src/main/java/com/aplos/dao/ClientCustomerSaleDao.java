package com.aplos.dao;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.domain.ClientCustomerSale;

import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
public interface ClientCustomerSaleDao extends BaseDao<ClientCustomerSale> {
    public ClientCustomerSaleDto addClientCustomerSale(ClientCustomerSaleDto clientCustomerSaleDto);
    public List<ClientCustomerSaleDto> getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order);
    public Integer getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate);
    public List<ClientCustomerSaleDto> getAllSalesForUserIdClientId(Long userId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order);
    public Integer getCountForClientUserSale(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate);
    public ClientCustomerSaleDto getClientCustomerSale(Long clientId, Long customerId, Long saleId);
}
