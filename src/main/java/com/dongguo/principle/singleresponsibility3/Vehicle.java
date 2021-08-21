package com.dongguo.principle.singleresponsibility3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-19:40
 * @description: 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
public class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }
}