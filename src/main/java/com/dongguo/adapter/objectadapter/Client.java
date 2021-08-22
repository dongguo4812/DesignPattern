package com.dongguo.adapter.objectadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:10
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        System.out.println(" === 对象适配器模式====");
        Computer computer = new Computer();
        computer.charging(new VoltageAdapter(new Voltage220V()));
    }
}