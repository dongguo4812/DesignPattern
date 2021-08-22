package com.dongguo.factorymethod.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:53
 * @description:
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Fruit apple = FruitFactory.getFruit("apple");
        Fruit banana = FruitFactory.getFruit("banana");
        Fruit pear = FruitFactory.getFruit("pear");
        apple.eat();
        banana.eat();
        pear.eat();
    }
}