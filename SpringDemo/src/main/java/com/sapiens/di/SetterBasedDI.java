package com.sapiens.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterBasedDI {
    @Bean
    public AccountService accountService(){

        return new AccountService();
    }
    @Bean
    public AccountServiceClient accountServiceClient(){

        return new AccountServiceClient();
    }
    public static class AccountServiceClient{
        private AccountService accountService;
        @Autowired
        public void setAccountService(AccountService accountService) {

            this.accountService = accountService;
        }
        public void showPendingDetails(){
            System.out.println(accountService.getAccountDetails("12345"));

        }
    }
}