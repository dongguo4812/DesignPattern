package com.dongguo.principle.segregation.segregation1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:19
 * @description: 对于类B来说，method4和method5不是必需的，但是由于接口I中有这两个方法，
 * 所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
 */
public class B implements I {
    public void method1() {
        System.out.println("类B实现接口I的方法1");
    }

    public void method2() {
        System.out.println("类B实现接口I的方法2");
    }

    public void method3() {
        System.out.println("类B实现接口I的方法3");
    }


    public void method4() {
    }

    public void method5() {
    }
}