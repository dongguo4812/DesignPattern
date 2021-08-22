package com.dongguo.simplefactory.fruit6;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-10:34
 * @description:
 */
public class FruitFactory {
    public static Fruit getFruit(String type) {
        try {

            Class fruit =  Class.forName(type);
            return (Fruit) fruit.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}