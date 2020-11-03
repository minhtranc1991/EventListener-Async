package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    MyHouse myHouse;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            String guestName = "Minh";
            System.out.println(Thread.currentThread().getName() + String.format(": %s đi tới cửa nhà!!!", guestName));
            System.out.println(Thread.currentThread().getName() + String.format(": %s bấm chuông và khai báo họ tên!", guestName));
            myHouse.ringTheDoorBell(guestName);
            System.out.println(Thread.currentThread().getName() + String.format(": %s đi về", guestName));
        };
    }
}
