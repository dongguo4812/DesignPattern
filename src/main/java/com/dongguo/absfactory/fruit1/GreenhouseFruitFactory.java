package com.dongguo.absfactory.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:17
 * @description:
 */
public class GreenhouseFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new GreenhouseApple();
    }

    @Override
    public Fruit getBanna() {
        return new GreenhouseBanana();
    }
}