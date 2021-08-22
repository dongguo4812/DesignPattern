package com.dongguo.adapter.objectadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:10
 * @description:
 */
public class Computer {
    //充电
    public void charging(IVoltage18V iVoltage18V) {
        if(iVoltage18V.output18V() == 18) {
            System.out.println("电压为18V, 可以充电~~");
        } else if (iVoltage18V.output18V() > 18) {
            System.out.println("电压大于18V, 不能充电~~");
        }
    }
}