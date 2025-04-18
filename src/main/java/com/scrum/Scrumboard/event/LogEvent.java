package com.scrum.Scrumboard.event;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class LogEvent extends EventListner{

    @Override
    public void handleEvent(String message) {
        message.chars().collect(Collectors.groupingBy());
    }
}
