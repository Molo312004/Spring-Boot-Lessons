package com.molier.DeliveryService.Model;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;


@Component
public class OrderService {
    //We should do delivery only through the DeliveryService interface reference to achieve loose coupling.
    //if we do delivery through BlueDart or Delhivery class reference directly, then it will be tightly coupled.
    private DeliveryService deliverService;

    public OrderService(DeliveryService deliverService){
        this.deliverService = deliverService;
    }
    public void placeOrder(String orderId, String address){
        // Logic to place order
        deliverService.deliverOrder(orderId, address);
    }
}

