package com.dongguo.facade;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:12
 * @description: 爆米花机
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    //打开
    public void on() {
        System.out.println(" popcorn on ");
    }

    //关闭
    public void off() {
        System.out.println(" popcorn ff ");
    }

    //制作爆米花
    public void pop() {
        System.out.println(" popcorn is poping ");
    }
}