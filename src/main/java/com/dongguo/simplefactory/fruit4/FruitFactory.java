package com.dongguo.simplefactory.fruit4;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:27
 * @description:
 */
public class FruitFactory {
    public static Fruit eatApple(){
        return new Apple();
    }
    public static Fruit eatBanana(){
        return new Banana();
    }
}