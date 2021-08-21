package com.dongguo.principle.singleresponsibility3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-19:40
 * @description:
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.runAir("飞机");
    }
}