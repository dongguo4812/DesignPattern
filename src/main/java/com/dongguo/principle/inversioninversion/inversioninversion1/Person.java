package com.dongguo.principle.inversioninversion.inversioninversion1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:20
 * @description: Person类
 */
public class Person {
    /**
     * @author Dongguo
     * @description: 接收消息的功能
     */
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}