package com.aplos.dao.impl;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.dao.CustomerAddressDao;
import com.aplos.domain.ClientRating;
import com.aplos.domain.CustomerAddress;
import com.aplos.transformer.CustomerAddressTransfomer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 14/05/2018.
 */
@Repository
public class CustomerAddressDaoImpl  extends BaseDaoImpl<CustomerAddress> implements CustomerAddressDao {

    @Autowired
    CustomerAddressTransfomer customerAddressTransfomer;

    @Override
    @Transactional
    public CustomerAddressDto addCustomerAddress(CustomerAddressDto customerAddressDto) {
        CustomerAddress customerAddress = customerAddressTransfomer.reverseTransform(customerAddressDto);
        CustomerAddress customerAddressResult = saveOrUpdate(customerAddress);
        CustomerAddressDto customerAddressDtoResult = customerAddressTransfomer.transform(customerAddressResult);
        return customerAddressDtoResult;
    }

    @Override
    public List<CustomerAddressDto> getCustomerAddressByCityId(Long cityId) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerAddress.class);
        criteria.createAlias("addressId", "addressId");
        criteria.createAlias("addressId.cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityId", cityId));
        List<CustomerAddress> customerAddresses = criteria.list();
        List<CustomerAddressDto> customerAddressDtos = new ArrayList<>();
        if(customerAddresses!=null && customerAddresses.size()>0){
            for(CustomerAddress customerAddress: customerAddresses){
                customerAddressDtos.add(customerAddressTransfomer.transform(customerAddress));
            }
        }
        return customerAddressDtos;
    }

    @Override
    public Integer getCustomerAddressCountByCityId(Long cityId) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerAddress.class);
        criteria.createAlias("addressId", "addressId");
        criteria.createAlias("addressId.cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityId", cityId));
        return criteria.list().size();
    }
}
