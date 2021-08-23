package com.dongguo.mediator;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:31
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Person man = new Man("张三",18);

        Person woman = new Woman("李四",25);
        man.getPartner(woman);
    }
}