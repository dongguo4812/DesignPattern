package com.dongguo.simplefactory.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:12
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        apple.eat();
        banana.eat();
    }
}