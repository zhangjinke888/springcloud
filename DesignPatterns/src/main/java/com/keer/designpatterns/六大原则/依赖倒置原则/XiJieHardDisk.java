package com.keer.designpatterns.六大原则.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class XiJieHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("希捷硬盘储存"+data);
    }

    @Override
    public String get() {
        System.out.println("希捷硬盘获取数据");
        return null;
    }
}
