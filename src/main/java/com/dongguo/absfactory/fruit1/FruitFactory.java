package com.dongguo.absfactory.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:12
 * @description:
 */
public interface FruitFactory {
    //实例化Apple
    public Fruit getApple();
    //实例化Banana
    public Fruit getBanna();
}