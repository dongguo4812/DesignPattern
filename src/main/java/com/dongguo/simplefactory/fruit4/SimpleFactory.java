package com.dongguo.simplefactory.fruit4;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:28
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Fruit apple =  FruitFactory.eatApple();
        Fruit banana =  FruitFactory.eatBanana();
        apple.eat();
        banana.eat();
    }
}