package com.dongguo.simplefactory.fruit5;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:31
 * @description:
 */
public class FruitFactory {
    public static Fruit getFruit(String type){
        if (type.equalsIgnoreCase("apple")){
            return new Apple();
        }else if (type.equalsIgnoreCase("banana")){
            return new Banana();
        }else {
            System.out.println("找不到该水果");
            return null;
        }
    }
}