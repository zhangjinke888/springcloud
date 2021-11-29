package com.keer.designpatterns.六大原则.里氏替换原则优化;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Square implements Quadrilateral {
    private Double size;

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSize() {
        return size;
    }

    @Override
    public Double getLength() {
        return size;
    }

    @Override
    public Double getWidth() {
        return size;
    }
}
