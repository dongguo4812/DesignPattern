package com.dongguo.adapter.classadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:58
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式====");
        Computer computer = new Computer();
        computer.charging(new VoltageAdapter());
    }
}