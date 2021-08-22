package com.dongguo.bridge;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:20
 * @description: 抽象类(Abstraction) :维护了Implementor
 */

public class Phone {
    //组合品牌
    private Brand brand;
    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }
    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}