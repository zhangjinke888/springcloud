package com.keer.designpatterns.六大原则.接口隔离原则;

/**
 * @Auther ker
 * @Date 2021/10/25
 * @ApiNode
 */
public class BadSafetyDoor implements Antitheft,FireProof {
    @Override
    public void antitheft() {
        System.out.println("一般的安全门只能防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("一般的安全门只能防火");
            }
}
