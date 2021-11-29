package com.keer.designpatterns.结构型.策略模式;

/**
 * @auther keer
 * @data 2021/11/1
 * @description 环境类：厨房
 */
public class Kitchen {
    private CrabCooking crabCooking;

    public void CookingMethod(){
        crabCooking.cookingMethod(); //策略模式精髓
    }

    public CrabCooking getCrabCooking() {
        return crabCooking;
    }

    public void setCrabCooking(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }
}
