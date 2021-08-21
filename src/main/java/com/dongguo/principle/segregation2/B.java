package com.dongguo.principle.segregation2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:30
 * @description:
 */
public class B implements I1, I2 {
    public void method1() {
        System.out.println("类B实现接口I的方法1");
    }

    public void method2() {
        System.out.println("类B实现接口I的方法2");
    }

    public void method3() {
        System.out.println("类B实现接口I的方法3");
    }
}