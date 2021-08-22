package com.dongguo.simplefactory.fruit5;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:32
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Fruit apple = FruitFactory.getFruit("apple");
        Fruit banana = FruitFactory.getFruit("banana");
        apple.eat();
        banana.eat();
    }
}