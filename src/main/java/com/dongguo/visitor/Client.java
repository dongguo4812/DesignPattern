package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:59
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Home owerHome = new Home();
        owerHome.add(new Dog());
        owerHome.add(new Cat());

        Owner owner = new Owner();
        owerHome.action(owner);

        Someone someone = new Someone();
        owerHome.action(someone);
    }
}