package com.aplos.dao.impl;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.dao.CustomerSalesExtraInfoDao;
import com.aplos.domain.CustomerSalesExtraInfo;
import com.aplos.transformer.CustomerSalesExtraInfoTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Aux072 on 02/06/2018.
 */
@Repository
public class CustomerSalesExtraInfoDaoImpl extends BaseDaoImpl<CustomerSalesExtraInfo> implements CustomerSalesExtraInfoDao{

    @Autowired
    CustomerSalesExtraInfoTransformer customerSalesExtraInfoTransformer;

    @Override
    @Transactional
    public CustomerSalesExtraInfoDto getCustomerSalesInforByCustomerId(Long customerId) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerSalesExtraInfo.class);
        criteria.createAlias("customerId", "customerId");
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        if(criteria.uniqueResult()!=null){
            return customerSalesExtraInfoTransformer.transform((CustomerSalesExtraInfo) criteria.uniqueResult());
        }else{
            return null;
        }
    }

    @Override
    @Transactional
    public CustomerSalesExtraInfoDto addCustomerSalesExtraInfoDto(CustomerSalesExtraInfoDto customerSalesExtraInfoDto) {
        CustomerSalesExtraInfo customerSalesExtraInfo = saveOrUpdate(customerSalesExtraInfoTransformer.reverseTransform(customerSalesExtraInfoDto));
        return customerSalesExtraInfoTransformer.transform(customerSalesExtraInfo);
    }

    /*@Override
    public CustomerSalesExtraInfoDto updateCustomerSalesExtraInfoDto(CustomerSalesExtraInfoDto customerSalesExtraInfoDto) {
        CustomerSalesExtraInfo customerSalesExtraInfo = merge(customerSalesExtraInfoTransformer.reverseTransform(customerSalesExtraInfoDto));
        return customerSalesExtraInfoTransformer.transform(customerSalesExtraInfo);
    }*/
}
