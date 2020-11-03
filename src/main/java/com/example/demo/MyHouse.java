package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyHouse {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void ringTheDoorBell(String guestName) {
        applicationEventPublisher.publishEvent(new DoorBellEvent(this, guestName));
    }
}
