package com.scrum.Scrumboard.service;


import lombok.Data;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Service {

    public static void main(String[] args) {
        String sample= "This is my";
        String words[] = sample.split(" ");
        StringJoiner joiner=new StringJoiner(" ");
        for(String word:words){
            joiner.add(reverse(word));
        }
        String result=formatInput(joiner.toString());
        System.out.println(result);
    }

    private static String formatInput(String word){
        word = word.toLowerCase();
       word= word.substring(0,1).toUpperCase()+word.substring(1);

        return word;
    }

    private static String reverse(String word){
    StringBuilder stringBuilder=new StringBuilder(word);
    return stringBuilder.reverse().toString();
    }
}

