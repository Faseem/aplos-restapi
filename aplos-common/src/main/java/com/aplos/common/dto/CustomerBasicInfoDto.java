package com.aplos.common.dto;

import java.io.Serializable;

/**
 * Created by Aux072 on 01/06/2018.
 */
public class CustomerBasicInfoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double customerToTalSale;
    private Double  customerBalanceOutStanding;
    private Double customerPendingChequeAmount;
    private String customerRating ;

    public Double getCustomerToTalSale() {
        return customerToTalSale;
    }

    public void setCustomerToTalSale(Double customerToTalSale) {
        this.customerToTalSale = customerToTalSale;
    }

    public Double getCustomerBalanceOutStanding() {
        return customerBalanceOutStanding;
    }

    public void setCustomerBalanceOutStanding(Double customerBalanceOutStanding) {
        this.customerBalanceOutStanding = customerBalanceOutStanding;
    }

    public Double getCustomerPendingChequeAmount() {
        return customerPendingChequeAmount;
    }

    public void setCustomerPendingChequeAmount(Double customerPendingChequeAmount) {
        this.customerPendingChequeAmount = customerPendingChequeAmount;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }
}
