package com.sapiens.JSRAnnotations;

public class OrderDetailsImpl4 implements OrderDetails{

    @Override
    public String getOrderDetails(String orderId) {
        return "Order Details from Impl4 to order id: "+orderId;
    }
}
