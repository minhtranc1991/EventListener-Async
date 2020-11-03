package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class DoorBellEvent extends ApplicationEvent {
    public String guestName;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public DoorBellEvent(Object source, String guestName) {
        super(source);
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }
}
