package com.dongguo.principle.segregation.segregation1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:18
 * @description: A类通过接口I依赖B类，但是只会用到1,2,3方法
 */
public class A {
    public void depend1(I i) {
        i.method1();
    }

    public void depend2(I i) {
        i.method2();
    }

    public void depend3(I i) {
        i.method3();
    }
}