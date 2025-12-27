package com.molier.store;

import org.springframework.stereotype.Service;

@Service
public class GpayPaymentService implements PaymentService{
    
    @Override
    public void processPayment(double amount){
        System.out.println("Gpay transaction completed!");
        System.out.println("Processed Amount: " + amount);
        tax(amount);
    }
    private void tax(double amount){
        double newAmt = amount * 0.1;
        System.out.println("Tax: " + newAmt);
    }
}
