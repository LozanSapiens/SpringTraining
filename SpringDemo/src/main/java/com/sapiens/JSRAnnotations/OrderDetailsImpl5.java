package com.sapiens.JSRAnnotations;

public class OrderDetailsImpl5 implements OrderDetails{

    @Override
    public String getOrderDetails(String orderId) {
        return "Order Details from Impl5 to order id: "+orderId;
    }
}
