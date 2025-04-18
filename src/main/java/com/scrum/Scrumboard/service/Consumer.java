package com.scrum.Scrumboard.service;


import java.math.BigDecimal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;

public class Consumer {

    public static void main(String[] args) {
        String s = "Java is awsome";

        char[] chars= s.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for(char c: chars){
           if(!map.containsKey(c)){
               map.put(c,1);
           }else{
               map.computeIfPresent(c,(k,v) ->{
                   return v+1;
               });

           }
        }

        map.entrySet().stream().forEach(x -> {
            System.out.println(x.getKey() +"->"+x.getValue() );
        });
    }





}
