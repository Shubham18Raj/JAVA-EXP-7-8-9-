package com.example.springhibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService service = context.getBean(AccountService.class);

        service.transfer(101, 102, 500.0); // Transfer ₹500 from 101 → 102

        context.close();
    }
}
