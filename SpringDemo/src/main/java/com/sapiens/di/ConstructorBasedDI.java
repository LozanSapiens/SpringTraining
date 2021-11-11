package com.sapiens.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorBasedDI {
    @Bean
    public AccountService accountService(){

        return new AccountService();
    }
    @Bean
    public AccountServiceClient accountServiceClient(){

        return new AccountServiceClient(accountService());
    }
    public static class AccountServiceClient{
        private AccountService accountService;
        //constructor based DI
        public AccountServiceClient(AccountService accountService) {

            this.accountService = accountService;
        }
        public void showPendingAccountDetails(){

            System.out.println(accountService.getAccountDetails("200"));
        }
    }
}

