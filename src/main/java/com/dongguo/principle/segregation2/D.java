package com.dongguo.principle.segregation2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:31
 * @description:
 */
public class D implements I1, I3 {
    public void method1() {
        System.out.println("类D实现接口I的方法1");
    }

    public void method4() {
        System.out.println("类D实现接口I的方法4");
    }

    public void method5() {
        System.out.println("类D实现接口I的方法5");
    }
}