package com.keer.designpatterns.结构型.钩子函数;

/**
 * @auther keer
 * @data 2021/11/2
 * @description
 */
public abstract class HookAbstract {
    final void finalTempleMethod(){
    abstractMethod1();
    abstractMethod2();
    if(hookMethod()){
        defaultMethod();
    }
        }
        abstract void abstractMethod1();
        abstract void abstractMethod2();

        void defaultMethod(){

        }
        boolean hookMethod(){
    return true;
        }


}
