package com.sapiens.SpringSecurity.Sequrity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String handler(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("user: "+authentication.getName());
        System.out.println("Role: "+authentication.getAuthorities());
        return "hello";
    }
}
