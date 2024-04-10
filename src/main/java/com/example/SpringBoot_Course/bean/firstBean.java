package com.example.SpringBoot_Course.bean;

public class firstBean {
    private String name;

    public firstBean(String name) {
        this.name = name;
    }

    public String hello() {
        return "beanCompnent Hello" + this.name;
    }
}
