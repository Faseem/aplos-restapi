package com.aplos.transformer;

import com.aplos.common.dto.SaleDto;
import com.aplos.common.dto.SaleItemDto;
import com.aplos.domain.Sale;
import com.aplos.domain.SaleItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Service
public class SaleTransformer implements BaseTransformer<Sale, SaleDto> {

    @Autowired
    SaleItemTransformer saleItemTransformer;

    @Override
    public SaleDto transform(Sale sale) {
        SaleDto saleDto = new SaleDto();
        saleDto.setSaleDate(sale.getSaleDate());
        saleDto.setSaleDiscount(sale.getSaleDiscount());
        saleDto.setSaleDiscountedamount(sale.getSaleDiscountedamount());
        saleDto.setSaleId(sale.getSaleId());
        saleDto.setSaleIsDiscountPercentage(sale.getSaleIsDiscountPercentage());
        //List<SaleItemDto> saleItemDtos = new ArrayList<>();
        /*if(sale.getSaleItems()!=null){
            for(SaleItem saleItem : sale.getSaleItems()){
                saleItemDtos.add(saleItemTransformer.transform(saleItem));
            }
            saleDto.setSaleItems(saleItemDtos);
        }*/
        saleDto.setSaleNumber(sale.getSaleNumber());
        saleDto.setSaleTotalNetPay(sale.getSaleTotalNetPay());
        saleDto.setSaleTotalSale(sale.getSaleTotalSale());
        saleDto.setSaleStatus(sale.getSaleStatus());
        saleDto.setSalePendingAmount(sale.getSalePendingAmount());

        return saleDto;
    }

    @Override
    public Sale reverseTransform(SaleDto saleDto) {
        Sale sale = new Sale();
        sale.setSaleDate(saleDto.getSaleDate());
        sale.setSaleDiscount(saleDto.getSaleDiscount());
        sale.setSaleDiscountedamount(saleDto.getSaleDiscountedamount());
        sale.setSaleId(saleDto.getSaleId());
        sale.setSaleIsDiscountPercentage(saleDto.getSaleIsDiscountPercentage());
        /*List<SaleItem> saleItems = new ArrayList<>();
        if(saleDto.getSaleItems()!=null){
            for(SaleItemDto saleItemDto : saleDto.getSaleItems()){
                saleItems.add(saleItemTransformer.reverseTransform(saleItemDto));
            }
            sale.setSaleItems(saleItems);
        }*/
        sale.setSaleNumber(saleDto.getSaleNumber());
        sale.setSaleTotalNetPay(saleDto.getSaleTotalNetPay());
        sale.setSaleTotalSale(saleDto.getSaleTotalSale());
        sale.setSaleStatus(saleDto.getSaleStatus());
        sale.setSalePendingAmount(saleDto.getSalePendingAmount());
        return sale;
    }
}
