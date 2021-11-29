package com.keer.designpatterns.六大原则.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description 硬盘
 */
public interface HardDisk {
    void save(String data);
    String get();
}
