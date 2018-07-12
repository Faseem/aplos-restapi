package com.aplos.dao.impl;

import com.aplos.common.dto.CustomerAddressDto;
import com.aplos.common.dto.CustomerBasicInfoDto;
import com.aplos.common.dto.CustomerDto;
import com.aplos.dao.CustomerDao;
import com.aplos.domain.ClientCustomer;
import com.aplos.domain.ClientCustomerSale;
import com.aplos.domain.Customer;
import com.aplos.domain.CustomerAddress;
import com.aplos.transformer.CustomerAddressTransfomer;
import com.aplos.transformer.CustomerTransformer;
import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aux072 on 28/05/2018.
 */
@Repository
public class CustomerDaoImpl  extends BaseDaoImpl<Customer> implements CustomerDao{

    @Autowired
    CustomerTransformer customerTransformer;

    @Override
    public List<CustomerDto> getCustomerByCityIdByClientId(Long cityId, Long clientId) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerAddress.class);

        List<CustomerDto> customerDtosToReturn = new ArrayList<>();

        criteria.createAlias("addressId", "addressId");
        criteria.createAlias("addressId.cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityId", cityId));
        List<CustomerAddress> customerAddresses = criteria.list();
        List<CustomerDto> customerDtos = new ArrayList<>();
        if(customerAddresses!=null && customerAddresses.size()>0){
            for(CustomerAddress customerAddress: customerAddresses){
                customerDtos.add(customerTransformer.transform(customerAddress.getCustomerId()));
            }
        }

        Criteria criteriaClient = getCurrentSession().createCriteria(ClientCustomer.class);
        criteriaClient.createAlias("clientId", "clientId");
        criteriaClient.add(Restrictions.eq("clientId.clientId", clientId));
        List<ClientCustomer>  clientCustomers= criteriaClient.list();
        List<CustomerDto> customerDtosByClientId = new ArrayList<>();
        if(clientCustomers!=null && clientCustomers.size()>0){
            for(ClientCustomer clientCustomer: clientCustomers){
                customerDtosByClientId.add(customerTransformer.transform(clientCustomer.getCustomerId()));
            }
        }

        if(customerDtosByClientId.size()>0){
            for(CustomerDto customerDto : customerDtosByClientId){
                if(this.isCustomerIdAvalilableInCityId(customerDto, customerDtos)){
                    customerDtosToReturn.add(customerDto);
                }
            }
        }

        return customerDtosToReturn;
    }

    @Override
    public List<CustomerDto> getAllPaginatedCustomersForCityIdClientId(Long cityId, Long clientId, Integer startFrom, Integer numberOfRecordNeed, String order) {
        Criteria criteria = getCurrentSession().createCriteria(CustomerAddress.class);

        List<CustomerDto> customerDtosToReturn = new ArrayList<>();

        criteria.createAlias("addressId", "addressId");
        criteria.createAlias("addressId.cityId", "cityId");
        criteria.add(Restrictions.eq("cityId.cityId", cityId));
        List<CustomerAddress> customerAddresses = criteria.list();
        List<CustomerDto> customerDtos = new ArrayList<>();
        if(customerAddresses!=null && customerAddresses.size()>0){
            for(CustomerAddress customerAddress: customerAddresses){
                customerDtos.add(customerTransformer.transform(customerAddress.getCustomerId()));
            }
        }

        Criteria criteriaClient = getCurrentSession().createCriteria(ClientCustomer.class);
        criteriaClient.createAlias("clientId", "clientId");
        criteriaClient.add(Restrictions.eq("clientId.clientId", clientId));

        if (numberOfRecordNeed != null) {
            criteria.setMaxResults(numberOfRecordNeed);
        }
        if (startFrom != null) {
            criteria.setFirstResult(startFrom);
        }

        List<ClientCustomer>  clientCustomers= criteriaClient.list();
        List<CustomerDto> customerDtosByClientId = new ArrayList<>();
        if(clientCustomers!=null && clientCustomers.size()>0){
            for(ClientCustomer clientCustomer: clientCustomers){
                customerDtosByClientId.add(customerTransformer.transform(clientCustomer.getCustomerId()));
            }
        }

        if(customerDtosByClientId.size()>0){
            for(CustomerDto customerDto : customerDtosByClientId){
                if(this.isCustomerIdAvalilableInCityId(customerDto, customerDtos)){
                    customerDtosToReturn.add(customerDto);
                }
            }
        }

        return customerDtosToReturn;
    }

    @Override
    public CustomerBasicInfoDto getCustomerSalesInforByCustomerId(Long customerId) {
        CustomerBasicInfoDto customerBasicInfoDto = new CustomerBasicInfoDto();
        Criteria criteria = getCurrentSession().createCriteria(ClientCustomerSale.class);
        criteria.createAlias("customerId", "customerId");
        criteria.add(Restrictions.eq("customerId.customerId", customerId));
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.sum("sale_total_net_pay"));
        criteria.setProjection(projectionList);
        List<Object[]> payments = criteria.list();
        System.out.println(payments);
        return customerBasicInfoDto;
    }

    @Override
    public CustomerDto getCustomerByCustomerId(Long customerId) {
        Criteria criteria = getCurrentSession().createCriteria(Customer.class);
        criteria.add(Restrictions.eq("customerId", customerId));
        return customerTransformer.transform((Customer)criteria.uniqueResult());
    }

    @Override
    public List<CustomerDto> getAllCustomersByClientId(Long clientId) {
        Criteria criteriaClient = getCurrentSession().createCriteria(ClientCustomer.class);
        criteriaClient.createAlias("clientId", "clientId");
        criteriaClient.add(Restrictions.eq("clientId.clientId", clientId));
        List<ClientCustomer>  clientCustomers= criteriaClient.list();
        List<CustomerDto> customerDtosByClientId = new ArrayList<>();
        if(clientCustomers!=null && clientCustomers.size()>0){
            for(ClientCustomer clientCustomer: clientCustomers){
                customerDtosByClientId.add(customerTransformer.transform(clientCustomer.getCustomerId()));
            }
        }
        return  customerDtosByClientId;
    }

    private boolean isCustomerIdAvalilableInCityId(CustomerDto customerDto, List<CustomerDto> customerDtos){
        boolean isAvailable = false;
        for(CustomerDto customerDto1 : customerDtos){
            if(customerDto.getCustomerId() == customerDto1.getCustomerId()){
                isAvailable = true;
                break;
            }
        }
        return isAvailable;
    }
}
