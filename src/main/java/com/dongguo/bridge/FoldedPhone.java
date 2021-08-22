package com.dongguo.bridge;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:21
 * @description: RefinedAbstraction : 是Abstraction 抽象类的子类
 */

public class FoldedPhone extends Phone {
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }
    public void open() {
        super.open();
        System.out.println(" 折叠样式手机");
    }
    public void close() {
        super.close();
        System.out.println(" 折叠样式手机");
    }
    public void call() {
        super.call();
        System.out.println(" 折叠样式手机");
    }
}