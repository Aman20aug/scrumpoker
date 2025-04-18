package com.scrum.Scrumboard.event;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@Service
public class EventManager implements  IEventManager{

    List<IEventListner> listnerList =new ArrayList<>();

    public void addListner(IEventListner eventManager){
        listnerList.add(eventManager);
    }

    public void removeListner(IEventListner eventListner){
        listnerList.remove(eventListner);
    }

    @Override
    public void raiseEvent(String message) {
        CompletableFuture.runAsync(() ->{
            for(IEventListner eventListner : listnerList){
                eventListner.handleEvent(message);
            }
        },
                Executors.newCachedThreadPool());
    }


}
