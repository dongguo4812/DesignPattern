package com.dongguo.decorator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:55
 * @description: 炒面
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}