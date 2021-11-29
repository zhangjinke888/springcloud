package com.keer.designpatterns.六大原则.开闭原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class DefaultSkin extends AbstractSkin{
    @Override
    public void disploy() {
        System.out.println("默认皮肤");
    }
}
