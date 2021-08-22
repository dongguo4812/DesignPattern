package com.dongguo.decorator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:56
 * @description: 培根配料
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {

        super(fastFood,2,"培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}