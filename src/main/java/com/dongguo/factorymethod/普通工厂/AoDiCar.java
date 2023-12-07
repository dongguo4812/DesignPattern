package com.dongguo.factorymethod.普通工厂;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class AoDiCar extends Car{
    public AoDiCar() {
        this.brand = "奥迪";
    }

    @Override
    public void run() {
        System.out.println(brand + "启动！");
    }
}
