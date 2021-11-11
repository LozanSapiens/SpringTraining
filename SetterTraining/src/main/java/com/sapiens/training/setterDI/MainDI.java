package com.sapiens.training.setterDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Communication communication1 = (Communication) context.getBean("communication1");
        communication1.communication();

        Communication communication2 = (Communication) context.getBean("communication2");
        communication2.communication();

        Communication communication3 = (Communication) context.getBean("communication3");
        communication3.communication();

        Communication communication4 = (Communication) context.getBean("communication4");
        communication4.communication();
    }
}
