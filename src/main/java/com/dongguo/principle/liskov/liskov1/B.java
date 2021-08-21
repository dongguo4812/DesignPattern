package com.dongguo.principle.liskov.liskov1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:22
 * @description: B 类继承了A,增加了一个新功能：完成两个数相加,然后和9 求和
 */
public class B extends A {
    //这里，重写了A 类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}