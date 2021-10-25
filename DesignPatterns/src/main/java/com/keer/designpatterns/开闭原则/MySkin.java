package com.keer.designpatterns.开闭原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class MySkin extends AbstractSkin{
    @Override
    public void disploy() {
        System.out.println("自定义皮肤");
    }
}
