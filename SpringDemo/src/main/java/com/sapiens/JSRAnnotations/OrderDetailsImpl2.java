package com.sapiens.JSRAnnotations;

public class OrderDetailsImpl2 implements OrderDetails{

    @Override
    public String getOrderDetails(String orderId) {
        return "Order Details from Impl2 to order id: "+orderId;
    }
}
