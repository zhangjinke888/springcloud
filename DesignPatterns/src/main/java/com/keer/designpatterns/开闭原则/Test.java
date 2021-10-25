package com.keer.designpatterns.开闭原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Test {
    public static void main(String[] args) {
        //创建输入法
        SouGouInput souGouInput = new SouGouInput();
        //创建皮肤
        DefaultSkin defaultSkin = new DefaultSkin();
        //设置皮肤
        souGouInput.setSkin(defaultSkin);
        //展示
        souGouInput.disploy();
    }
}
