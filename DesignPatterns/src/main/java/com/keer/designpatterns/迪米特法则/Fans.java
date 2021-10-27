package com.keer.designpatterns.迪米特法则;

/**
 * @auther keer
 * @data 2021/10/26
 * @description
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
