package com.sapiens.JSRAnnotations;

import javax.annotation.Resource;
import java.util.Arrays;

public class OrderDetailsClient {
    @Resource(name="OrderDetailsA")
    private OrderDetails orderDetails;
    public void showPendingOrderDetails(){
        for(String orderId : Arrays.asList("100", "300", "500", "780")){
            System.out.println(orderDetails.getOrderDetails(orderId));
        }
    }
}
