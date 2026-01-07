package com.molier.DeliveryService.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Marking this class as Primary to give it higher preference when multiple beans of the same type are present.

@Service
public class Delhivery implements DeliveryService {
    
    @Override
    public void deliverOrder(String orderId, String address){
        
        System.out.println("Order: " + orderId + " is being delivered to " + address + " via Delhivery.");
    }

}
