package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyDog {
    @Async
    @EventListener
    public void doorBellEventListener(DoorBellEvent doorBellEvent) throws InterruptedException {
        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + ": Chó thức dậy!!!");
        System.out.println(String.format("%s: Chó sủa!! Người tên là %s gõ cửa!!!",Thread.currentThread().getName(),doorBellEvent.getGuestName()));
    }
}
