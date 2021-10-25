package com.keer.designpatterns.接口隔离原则;

/**
 * @Auther ker
 * @Date 2021/10/25
 * @ApiNode
 */
public class Test {
    public static void main(String[] args) {
        //一般的安全门
        BadSafetyDoor badSafetyDoor = new BadSafetyDoor();
        badSafetyDoor.antitheft();
        badSafetyDoor.fireProof();
        System.out.println("+++++++++++++++++++++");
        //我的安全门
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.antitheft();
        mySafetyDoor.fireProof();
        mySafetyDoor.waterProof();
    }
}
