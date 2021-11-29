package com.keer.designpatterns.六大原则.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("使用两个金士顿内存条");
    }
}
