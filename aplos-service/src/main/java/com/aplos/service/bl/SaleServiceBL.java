package com.aplos.service.bl;

import com.aplos.common.dto.SaleDto;
import com.aplos.dao.CustomerSalesExtraInfoDao;
import com.aplos.dao.SaleDao;
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
public class SaleServiceBL {
    private static final Logger LOGGER = LoggerFactory.getLogger(SaleServiceBL.class);

    @Autowired
    SaleDao saleDao;

    public SaleDto addSale(SaleDto saleDto){
        LOGGER.info("SaleServiceBL.addSale(saleDto) execution started.");
        if(null==saleDto.getSaleDate()){
            saleDto.setSaleDate(new Date());
        }
        if(null == saleDto.getSaleStatus()){
            saleDto.setSaleStatus("Pending");
        }
        if(null == saleDto.getSalePendingAmount()){
            saleDto.setSalePendingAmount(saleDto.getSaleTotalNetPay());
        }
        return saleDao.addSale(saleDto);
    }

    public List<SaleDto> getSalesByCustomerId(Long customerId){
        LOGGER.info("SaleServiceBL.getSalesByCustomerId(customerId) execution started.");
        return saleDao.getSalesByCustomerId(customerId);
    }
}
