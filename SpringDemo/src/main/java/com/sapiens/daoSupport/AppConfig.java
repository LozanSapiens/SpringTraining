package com.sapiens.daoSupport;

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
        context.getBean(PersonClientBean.class).run();
        context.getBean(LocalEntityManagerFactoryBean.class).destroy();

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(com.sapiens.daoSupport.AppConfig.class);
        context2.getBean(EmployeeClientBean.class).run();
        context2.getBean(LocalEntityManagerFactoryBean.class).destroy();
    }
}
