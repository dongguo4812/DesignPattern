package com.dongguo.simplefactory.fruit6;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:35
 * @description:
 */
public class SimpleFactory {
    public static void main(String[] args) {
        //1 Class.forName()注意：此处填完整类名
        Fruit apple = FruitFactory.getFruit("com.dongguo.simplefactory.fruit6.Apple");
        Fruit banana = FruitFactory.getFruit("com.dongguo.simplefactory.fruit6.Banana");
        apple.eat();
        banana.eat();
        //另外两种反射创建对象实例的方法就不介绍了
        //2 Class.class
        //3 class.getClass
    }
}