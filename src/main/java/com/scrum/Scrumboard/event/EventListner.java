package com.scrum.Scrumboard.event;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class EventListner implements IEventListner{

    @Autowired
    EventManager eventManager;

    @PostConstruct
    public void subscribe(){
        eventManager.addListner(this);
    }


    @PreDestroy
    public void unSuscribe(){
        eventManager.removeListner(this);
    }


}
