package com.keer.designpatterns.六大原则.开闭原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void disploy(){
        skin.disploy();
    }
}
