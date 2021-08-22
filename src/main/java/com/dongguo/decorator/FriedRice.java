package com.dongguo.decorator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:55
 * @description: 炒饭
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    public float cost() {
        return getPrice();
    }
}
