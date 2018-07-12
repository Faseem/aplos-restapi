package com.aplos.service.bl;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.common.dto.SaleDto;
import com.aplos.dao.*;
import com.aplos.domain.CustomerSalesExtraInfo;
import com.aplos.transformer.ClientTrasformenr;
import com.aplos.transformer.UserTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class ClientCustomerSaleServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCustomerSaleServiceBL.class);

    @Autowired
    ClientCustomerSaleDao clientCustomerSaleDao;

    @Autowired
    UserDao userDao;

    @Autowired
    ClientDao clientDao;

    @Autowired
    CustomerDao customerDao;

    @Autowired
    SaleDao saleDao;

    @Autowired
    CustomerSalesExtraInfoDao customerSalesExtraInfoDao;

    public ClientCustomerSaleDto addClientCustomerSale(ClientCustomerSaleDto clientCustomerSaleDto){
        LOGGER.info("ClientCustomerServiceBL.addClientCustomerSale(clientCustomerSaleDto) execution started.");
        //set extra sale info values
        //this.updateExtraSaleInfo(clientCustomerSaleDto);
        return clientCustomerSaleDao.addClientCustomerSale(clientCustomerSaleDto);
    }

    public List<ClientCustomerSaleDto> getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("ClientCustomerServiceBL.getAllSalesForCustomerIdClientId(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");

        return clientCustomerSaleDao.getAllSalesForCustomerIdClientId(clientId, customerId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
    }

    public Integer getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate){
        LOGGER.info("ClientCustomerServiceBL.getCountForClientCustomerSale(Long clientId, Long customerId, Boolean isOmitSettled, Date startDate, Date endDate) execution started.");

        return clientCustomerSaleDao.getCountForClientCustomerSale(clientId, customerId, isOmitSettled, startDate, endDate);
    }

    public List<ClientCustomerSaleDto> getAllSalesForUserIdClientId(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order){
        LOGGER.info("ClientCustomerServiceBL.getAllSalesForUserIdClientId(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate, Integer startFrom, Integer numberOfRecordNeed, String order) execution started.");

        return clientCustomerSaleDao.getAllSalesForUserIdClientId(clientId, userId, isOmitSettled, startDate, endDate, startFrom, numberOfRecordNeed, order);
    }

    public Integer getCountForClientUserSale(Long clientId, Long userId, Boolean isOmitSettled, Date startDate, Date endDate){
        LOGGER.info("ClientCustomerServiceBL.getCountForClientUserSale(Long clientId, Long userID, Boolean isOmitSettled, Date startDate, Date endDate) execution started.");

        return clientCustomerSaleDao.getCountForClientUserSale(clientId, userId, isOmitSettled, startDate, endDate);
    }

    private void updateExtraSaleInfo(ClientCustomerSaleDto clientCustomerSaleDto){
        LOGGER.info("ClientCustomerServiceBL.updateExtraSaleInfo(clientCustomerSaleDto) execution started.");
        CustomerSalesExtraInfoDto customerSalesExtraInfoDto =  customerSalesExtraInfoDao.getCustomerSalesInforByCustomerId(clientCustomerSaleDto.getCustomerId().getCustomerId());
        SaleDto saleDto =  saleDao.getSaleById(clientCustomerSaleDto.getSaleId().getSaleId());

        if(customerSalesExtraInfoDto==null){
            customerSalesExtraInfoDto = new CustomerSalesExtraInfoDto();
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoBalanceOutstanding(saleDto.getSaleTotalNetPay());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoLastTransaction("Add New Sale of worth : " + saleDto.getSaleTotalSale());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoLasttransactionDate(new Date());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalDiscounts(saleDto.getSaleDiscountedamount());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalSalel(saleDto.getSaleTotalSale());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalChequepayements(0D);
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalPendingchequepayment(0D);
            customerSalesExtraInfoDto.setCustomerId(clientCustomerSaleDto.getCustomerId());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalChequepayements(0D);

        }else{
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoBalanceOutstanding(customerSalesExtraInfoDto.getCustomerSalesExtraInfoBalanceOutstanding()+saleDto.getSaleTotalNetPay());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoLastTransaction("Add New Sale of worth : " + saleDto.getSaleTotalSale());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoLasttransactionDate(new Date());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalDiscounts(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalDiscounts() + saleDto.getSaleDiscountedamount());
            customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalSalel(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalSalel() + saleDto.getSaleTotalSale());
        }

        CustomerSalesExtraInfoDto customerSalesExtraInfoDtoRes = customerSalesExtraInfoDao.addCustomerSalesExtraInfoDto(customerSalesExtraInfoDto);

        LOGGER.info("CustomerSalesExtraInfo has been updated before enter sale for the Id : "+customerSalesExtraInfoDtoRes.getCustomerSalesExtraInfoId());
    }

    public ClientCustomerSaleDto getClientCustomerSale(Long clientId, Long customerId, Long saleId){
        LOGGER.info("ClientCustomerServiceBL.getClientCustomerSale(Long clientId, Long customerId, Long saleId) execution started.");
        return clientCustomerSaleDao.getClientCustomerSale(clientId, customerId, saleId);
    }

}
