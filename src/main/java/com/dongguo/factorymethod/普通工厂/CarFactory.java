package com.dongguo.factorymethod.普通工厂;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class CarFactory {
    public static Car getCar(String brand){
        Car car = null;
        if (StrUtil.equals(brand,"宝马")){
            car = new BaoMaCar();
        }else if (StrUtil.equals(brand, "奥迪")){
            car = new AoDiCar();
        }
        return car;
    }
}
