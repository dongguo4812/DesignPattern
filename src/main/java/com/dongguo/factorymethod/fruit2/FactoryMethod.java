package com.dongguo.factorymethod.fruit2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:57
 * @description:
 */
public class FactoryMethod {
    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.eat();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.eat();

        PearFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        pear.eat();
    }
}