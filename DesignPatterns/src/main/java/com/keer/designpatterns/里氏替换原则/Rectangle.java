package com.keer.designpatterns.里氏替换原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description 长方形
 */
public class Rectangle {
    private Integer length;
    private Integer width;

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }
}
