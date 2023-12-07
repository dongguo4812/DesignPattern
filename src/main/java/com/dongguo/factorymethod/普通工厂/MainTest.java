package com.dongguo.factorymethod.普通工厂;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class MainTest {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("奥迪");
        car.run();
    }
}
