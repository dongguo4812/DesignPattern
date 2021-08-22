package com.dongguo.simplefactory.fruit2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:16
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        //用到了多态
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        apple.eat();
        banana.eat();
    }
}