package com.dongguo.principle.segregation2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:30
 * @description: C 类通过接口I1,I3 依赖(使用) D 类，但是只会用到1,4,5 方法
 */
public class C {
    public void depend1(I1 i) {
        i.method1();
    }

    public void depend2(I3 i) {
        i.method4();
    }

    public void depend3(I3 i) {
        i.method5();
    }
}