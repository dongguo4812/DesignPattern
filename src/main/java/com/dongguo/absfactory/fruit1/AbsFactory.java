package com.dongguo.absfactory.fruit1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:15
 * @description:
 */
public class AbsFactory {
    public static void main(String[] args) {
        FruitFactory ff = new NorthFruitFactory();
        Fruit northApple = ff.getApple();
        northApple.eat();
        Fruit northBanna = ff.getBanna();
        northBanna.eat();

        FruitFactory ff1 = new SouthFruitFactory();
        Fruit southApple = ff1.getApple();
        southApple.eat();
        Fruit southBanana = ff1.getBanna();
        southBanana.eat();
        FruitFactory ff2 = new GreenhouseFruitFactory();
        Fruit greenhouseApple = ff2.getApple();
        greenhouseApple.eat();
        Fruit greenhouseBanna = ff2.getBanna();
        greenhouseBanna.eat();
    }
}