package com.keer.designpatterns.里氏替换原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description 正方形
 */
public class Square extends Rectangle{

    @Override
    public void setWidth(Integer width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(Integer length) {
        super.setLength(length);
        super.setWidth(length);
    }

}
