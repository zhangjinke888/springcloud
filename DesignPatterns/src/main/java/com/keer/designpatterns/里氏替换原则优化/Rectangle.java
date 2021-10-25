package com.keer.designpatterns.里氏替换原则优化;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Rectangle implements Quadrilateral {
    private Double length;
    private Double width;

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double getLength() {
        return length;
    }

    @Override
    public Double getWidth() {
        return width;
    }
}
