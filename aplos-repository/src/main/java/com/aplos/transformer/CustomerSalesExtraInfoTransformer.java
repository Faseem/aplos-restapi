package com.aplos.transformer;

import com.aplos.common.dto.CustomerSalesExtraInfoDto;
import com.aplos.domain.CustomerSalesExtraInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aux072 on 02/06/2018.
 */
@Service
public class CustomerSalesExtraInfoTransformer implements BaseTransformer<CustomerSalesExtraInfo, CustomerSalesExtraInfoDto> {

    @Autowired
    CustomerTransformer customerTransformer;

    @Override
    public CustomerSalesExtraInfoDto transform(CustomerSalesExtraInfo customerSalesExtraInfo) {
        CustomerSalesExtraInfoDto customerSalesExtraInfoDto = new CustomerSalesExtraInfoDto();
        customerSalesExtraInfoDto.setCustomerId(customerTransformer.transform(customerSalesExtraInfo.getCustomerId()));
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoBalanceOutstanding(customerSalesExtraInfo.getCustomerSalesExtraInfoBalanceOutstanding());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoId(customerSalesExtraInfo.getCustomerSalesExtraInfoId());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoLasttransactionDate(customerSalesExtraInfo.getCustomerSalesExtraInfoLasttransactionDate());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalChequepayements(customerSalesExtraInfo.getCustomerSalesExtraInfoTotalChequepayements());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalDiscounts(customerSalesExtraInfo.getCustomerSalesExtraInfoTotalDiscounts());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalPendingchequepayment(customerSalesExtraInfo.getCustomerSalesExtraInfoTotalPendingchequepayment());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoTotalSalel(customerSalesExtraInfo.getCustomerSalesExtraInfoTotalSalel());
        customerSalesExtraInfoDto.setCustomerSalesExtraInfoLastTransaction(customerSalesExtraInfo.getCustomerSalesExtraInfoLastTransaction());
        return customerSalesExtraInfoDto;
    }

    @Override
    public CustomerSalesExtraInfo reverseTransform(CustomerSalesExtraInfoDto customerSalesExtraInfoDto) {
        CustomerSalesExtraInfo customerSalesExtraInfo = new CustomerSalesExtraInfo();
        customerSalesExtraInfo.setCustomerId(customerTransformer.reverseTransform(customerSalesExtraInfoDto.getCustomerId()));
        customerSalesExtraInfo.setCustomerSalesExtraInfoBalanceOutstanding(customerSalesExtraInfoDto.getCustomerSalesExtraInfoBalanceOutstanding());
        customerSalesExtraInfo.setCustomerSalesExtraInfoId(customerSalesExtraInfoDto.getCustomerSalesExtraInfoId());
        customerSalesExtraInfo.setCustomerSalesExtraInfoLasttransactionDate(customerSalesExtraInfoDto.getCustomerSalesExtraInfoLasttransactionDate());
        customerSalesExtraInfo.setCustomerSalesExtraInfoTotalChequepayements(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalChequepayements());
        customerSalesExtraInfo.setCustomerSalesExtraInfoTotalDiscounts(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalDiscounts());
        customerSalesExtraInfo.setCustomerSalesExtraInfoTotalPendingchequepayment(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalPendingchequepayment());
        customerSalesExtraInfo.setCustomerSalesExtraInfoTotalSalel(customerSalesExtraInfoDto.getCustomerSalesExtraInfoTotalSalel());
        customerSalesExtraInfo.setCustomerSalesExtraInfoLastTransaction(customerSalesExtraInfoDto.getCustomerSalesExtraInfoLastTransaction());
        return customerSalesExtraInfo;
    }
}
