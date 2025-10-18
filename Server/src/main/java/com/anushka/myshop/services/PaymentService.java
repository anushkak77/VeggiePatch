package com.anushka.myshop.services;

import com.anushka.myshop.payload.PaymentDetails;

public interface PaymentService {

    public PaymentDetails CreateOrder(Double amount);

}
