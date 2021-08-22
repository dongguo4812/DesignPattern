package com.dongguo.absfactory;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:14
 * @description:
 */
public class NorthFruitFactory implements FruitFactory {

    public Fruit getApple() {
        return new NorthApple();
    }

    public Fruit getBanna() {
        return new NorthBanana();
    }
}