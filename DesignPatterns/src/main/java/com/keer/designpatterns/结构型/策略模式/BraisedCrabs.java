package com.keer.designpatterns.结构型.策略模式;

/**
 * @auther keer
 * @data 2021/11/1
 * @description红烧大闸蟹
 * 具体策略类：红烧大闸蟹
 */
public class BraisedCrabs implements CrabCooking{
    @Override
    public void cookingMethod() {
        System.out.println("红烧大闸蟹简简单单做法");
    }
}
