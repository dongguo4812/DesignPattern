package com.dongguo.mediator.improve;


/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:31
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Person man = new Man("张三",30,mediator);
        Person woman = new Woman("lisi",30,mediator);
        man.getPartner(woman);
    }
}