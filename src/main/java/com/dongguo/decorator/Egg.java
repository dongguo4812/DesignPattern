package com.dongguo.decorator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:56
 * @description: 鸡蛋配料
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}