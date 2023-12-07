package com.dongguo.factorymethod.工厂方法;

/**
 * @Author: Administrator
 * @Date: 2023-12-07
 */
public class BaoMaFactory extends CarFactory{

    @Override
    public  Car newCar() {
        return new BaoMaCar();
    }
}
