package com.scrum.Scrumboard.entity;

public enum Department {
    Development("DEV"),
    Tester("QA"),
    Product("PROD");

    private final String code;
    private Department(String code){
        this.code=code;
    }
    public String getCode() {
        return code;
    }
}
