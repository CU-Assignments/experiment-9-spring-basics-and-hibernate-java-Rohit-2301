package com.example;

import com.example.config.AppConfig;
import com.example.service.BankingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var service = context.getBean(BankingService.class);

        try {
            service.transferMoney(101, 102, 500);
            System.out.println("Transaction successful!");
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        context.close();
    }
}
