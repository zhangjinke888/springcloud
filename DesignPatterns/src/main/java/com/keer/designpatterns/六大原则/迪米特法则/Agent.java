package com.keer.designpatterns.六大原则.迪米特法则;

/**
 * @auther keer
 * @data 2021/10/26
 * @description经纪人
 */
public class Agent {
    Company company;
    Star star;
    Fans fans;
    //粉丝见面会
    public void meeting(){
        System.out.println(fans.getName()+"与"+star.getName()+"见面");
    }
    //公司商务合作
    public void working(){
        System.out.println(company.getName()+"与"+star.getName()+"合作");

    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
}
