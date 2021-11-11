package com.sapiens.JSRAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AppRunner {
    @Bean(name = "OrderDetailsA")
    public OrderDetails orderDetailsByProvider1(){
        return new OrderDetailsImpl1();
    }

    @Bean(name = "OrderDetailsB")
    public OrderDetails orderDetailsByProvider2(){
        return new OrderDetailsImpl2();
    }
    @Bean(name = "OrderDetailsC")
    public OrderDetails orderDetailsByProvider3(){
        return new OrderDetailsImpl3();
    }
    @Bean(name = "OrderDetailsD")
    public OrderDetails orderDetailsByProvider4(){
        return new OrderDetailsImpl4();
    }
    @Bean(name = "OrderDetailsE")
    public OrderDetails orderDetailsByProvider5(){
        return new OrderDetailsImpl5();
    }
    @Bean
    public OrderDetailsClient createClient(){
        return new OrderDetailsClient();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderDetailsClient bean = context.getBean(OrderDetailsClient.class);
        bean.showPendingOrderDetails();
    }
}
