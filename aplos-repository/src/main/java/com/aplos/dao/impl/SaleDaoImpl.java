package com.aplos.dao.impl;

import com.aplos.common.dto.ClientCustomerSaleDto;
import com.aplos.common.dto.SaleDto;
import com.aplos.dao.BaseDao;
import com.aplos.dao.SaleDao;
import com.aplos.domain.ClientCustomerSale;
import com.aplos.domain.Sale;
import com.aplos.transformer.SaleTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 06/06/2018.
 */
@Repository
public class SaleDaoImpl extends BaseDaoImpl<Sale> implements SaleDao {

    @Autowired
    SaleTransformer saleTransformer;

    @Override
    @Transactional
    public SaleDto addSale(SaleDto saleDto) {
        Sale sale = saveOrUpdate(saleTransformer.reverseTransform(saleDto));
        getSaleById(sale.getSaleId());
        return getSaleById(sale.getSaleId());
    }

    @Override
    @Transactional
    public SaleDto getSaleById(Long saleId) {
        Criteria criteria = getCurrentSession().createCriteria(Sale.class);
        criteria.add(Restrictions.eq("saleId", saleId));
        return saleTransformer.transform((Sale) criteria.uniqueResult());
    }

    @Override
    @Transactional
    public List<SaleDto> getSalesByCustomerId(Long customerId){
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);
        criteria.createAlias("customerId", "customerId");
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        List<ClientCustomerSale> clientCustomerSales = criteria.list();
        List<SaleDto> saleDtos = new ArrayList<>();
        if(clientCustomerSales != null && clientCustomerSales.size()>0){
            for(ClientCustomerSale clientCustomerSale : clientCustomerSales){
                saleDtos.add(saleTransformer.transform(clientCustomerSale.getSaleId()));
            }
        }
        return saleDtos;
    }
}
