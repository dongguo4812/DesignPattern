package com.dongguo.absfactory.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:15
 * @description:
 */
public class SouthFruitFactory implements FruitFactory {
    public Fruit getApple() {
        return new SouthApple();
    }

    public Fruit getBanna() {
        return new SouthBanana();
    }
}