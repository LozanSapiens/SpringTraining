package com.sapiens.JSRAnnotations;

public class OrderDetailsImpl1 implements OrderDetails{

    @Override
    public String getOrderDetails(String orderId) {
        return "Order Details from Impl1 to order id: "+orderId;
    }
}
