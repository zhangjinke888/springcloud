package com.keer.designpatterns.迪米特法则;

/**
 * @auther keer
 * @data 2021/10/26
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Star star = new Star("周星驰");
        Company company = new Company("娱乐公司");
        //经纪人是他俩见面讨论合作事宜
        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setStar(star);
        agent.working();
        System.out.println("+++++++++++++++++++++++");
        //经纪人开展粉丝见面会
        Fans fans = new Fans("粉丝");
        agent.setFans(fans);
        agent.meeting();
    }
}
