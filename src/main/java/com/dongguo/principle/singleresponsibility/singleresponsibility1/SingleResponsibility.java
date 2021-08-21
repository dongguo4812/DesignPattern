package com.dongguo.principle.singleresponsibility.singleresponsibility1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-18:15
 * @description:单一职责原则
 */
public class SingleResponsibility {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}