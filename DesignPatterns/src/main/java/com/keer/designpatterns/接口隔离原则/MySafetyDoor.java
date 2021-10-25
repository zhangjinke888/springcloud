package com.keer.designpatterns.接口隔离原则;

/**
 * @Auther ker
 * @Date 2021/10/25
 * @ApiNode我的安全门
 */
public class MySafetyDoor implements Antitheft,FireProof,WaterProof {
    @Override
    public void antitheft() {
        System.out.println("我的安全门防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("我的安全门防火");
    }

    @Override
    public void waterProof() {
        System.out.println("我的安全门防水");
    }
}
