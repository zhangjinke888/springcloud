package com.keer.designpatterns.迪米特法则;

/**
 * @auther keer
 * @data 2021/10/26
 * @description
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
