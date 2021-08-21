package com.dongguo.principle.segregation2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:29
 * @description: A 类通过接口I1,I2 依赖(使用) B 类，但是只会用到1,2,3 方法
 */
public class A {
    public void depend1(I1 i) {
        i.method1();
    }

    public void depend2(I2 i) {
        i.method2();
    }

    public void depend3(I2 i) {
        i.method3();
    }
}