package com.dongguo.factorymethod.fruit2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:56
 * @description:
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}