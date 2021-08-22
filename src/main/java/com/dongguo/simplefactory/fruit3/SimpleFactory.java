package com.dongguo.simplefactory.fruit3;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:24
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Fruit apple = new FruitFactory().eatApple();
        Fruit banana = new FruitFactory().eatBanana();
        apple.eat();
        banana.eat();
    }
}