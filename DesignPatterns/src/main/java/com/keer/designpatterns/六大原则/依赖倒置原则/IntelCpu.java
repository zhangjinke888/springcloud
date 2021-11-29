package com.keer.designpatterns.六大原则.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("英特尔处理器运行");
    }
}
