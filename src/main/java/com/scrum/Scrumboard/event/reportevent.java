package com.scrum.Scrumboard.event;


import org.springframework.stereotype.Service;

@Service
public class reportevent extends EventListner{
    @Override
    public void handleEvent(String message) {
        System.out.println("report event"+message);
    }
}
