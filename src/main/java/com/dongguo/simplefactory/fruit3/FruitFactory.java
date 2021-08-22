package com.dongguo.simplefactory.fruit3;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:22
 * @description:
 */
public class FruitFactory {
    public Fruit eatApple(){
        return new Apple();
    }
    public Fruit eatBanana(){
        return new Banana();
    }
}