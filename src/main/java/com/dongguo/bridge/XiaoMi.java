package com.dongguo.bridge;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:22
 * @description: ConcreteImplementorA /B ：行为的具体实现类
 */

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println(" 小米手机开机");
    }
    @Override
    public void close() {
        System.out.println(" 小米手机关机");
    }
    @Override
    public void call() {
        System.out.println(" 小米手机打电话");
    }
}