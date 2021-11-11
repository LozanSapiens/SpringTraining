package com.sapiens.jpaApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("example-unit");
        return factoryBean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(ContactClientBean.class).run();
        context.getBean(LocalEntityManagerFactoryBean.class).destroy();
    }
}