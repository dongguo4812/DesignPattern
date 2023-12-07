package com.dongguo.factorymethod.普通工厂;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class BaoMaCar extends Car{
    public BaoMaCar() {
        this.brand = "宝马";
    }

    @Override
    public void run() {
        System.out.println(brand + "启动!");
    }
}
