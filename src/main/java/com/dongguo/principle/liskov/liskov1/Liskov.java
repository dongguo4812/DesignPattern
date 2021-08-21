package com.dongguo.principle.liskov.liskov1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:23
 * @description:
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));//11-3=8
        System.out.println("1-8=" + a.func1(1, 8));//1-8=-7
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));//11-3=14  这里本意是求出11-3,结果变成了11+3
        System.out.println("1-8=" + b.func1(1, 8));// 1-8=9   这里本意是求出1-8,结果变成了1+8
        System.out.println("11+3+9=" + b.func2(11, 3));//11+3+9=23
    }
}