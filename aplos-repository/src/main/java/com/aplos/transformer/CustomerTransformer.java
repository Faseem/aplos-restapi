package com.aplos.transformer;

import com.aplos.common.dto.CustomerDto;
import com.aplos.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 08/05/2018.
 */
@Service
public class CustomerTransformer implements BaseTransformer<Customer,CustomerDto> {

    @Autowired
    UserTransformer userTransformer;

    @Override
    public CustomerDto transform(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        if(customer.getCreatedUserId()!=null){
            customerDto.setCreatedUserId(userTransformer.transform(customer.getCreatedUserId()));
        }
        customerDto.setCustomerContactNumberOne(customer.getCustomerContactNumberOne());
        customerDto.setCustomerContactNumberTwo(customer.getCustomerContactNumberTwo());
        customerDto.setCustomerDescription(customer.getCustomerDescription());
        customerDto.setCustomerId(customer.getCustomerId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerEmail(customer.getCustomerEmail());

        return customerDto;
    }

    @Override
    public Customer reverseTransform(CustomerDto customerDto) {
        Customer customer = new Customer();
        if(customerDto.getCreatedUserId()!=null){
          customer.setCreatedUserId(userTransformer.reverseTransform(customerDto.getCreatedUserId()));
        }
        customer.setCustomerContactNumberOne(customerDto.getCustomerContactNumberOne());
        customer.setCustomerContactNumberTwo(customerDto.getCustomerContactNumberTwo());
        customer.setCustomerDescription(customerDto.getCustomerDescription());
        customer.setCustomerId(customerDto.getCustomerId());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerEmail(customerDto.getCustomerEmail());
        return customer;
    }
}
