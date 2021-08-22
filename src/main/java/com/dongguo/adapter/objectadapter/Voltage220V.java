package com.dongguo.adapter.objectadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:00
 * @description:
 */
public class Voltage220V {
    //输出220V 的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}