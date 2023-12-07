package com.dongguo.factorymethod.工厂方法;

/**
 * @Author: Administrator
 * @Date: 2023-12-07
 */
public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory1 = new AoDiFactory();
        Car car1 = carFactory1.newCar();
        car1.run();
        CarFactory carFactory2 = new BaoMaFactory();
        Car car2 = carFactory2.newCar();
        car2.run();
    }
}
