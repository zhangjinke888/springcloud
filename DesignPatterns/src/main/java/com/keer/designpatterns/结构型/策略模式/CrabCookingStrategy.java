package com.keer.designpatterns.结构型.策略模式;

/**
 * @auther keer
 * @data 2021/11/1
 * @description
 */
public class CrabCookingStrategy  {
    public static void chooseMethod(String key){
        Kitchen kitchen = new Kitchen();
        if(key.equals("清蒸")){
            SteamedCrabs steamedCrabs = new SteamedCrabs();
            kitchen.setCrabCooking(steamedCrabs);

        }
        if(key.equals("红烧")){
            CrabCooking braisedCrabs = new BraisedCrabs();
            kitchen.setCrabCooking(braisedCrabs);
        }
        kitchen.CookingMethod();
    }

    public static void main(String[] args) {
        chooseMethod("红烧");
    }
}
