package com.molier.DeliveryService.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BlueDart implements DeliveryService{

    @Override
    public void deliverOrder(String orderId, String address){
        System.out.println("Order: " + orderId + " is being delivered to address: " + address + " via BlueDart.");
        System.out.println("Happy Holidays :)");
    }
}
