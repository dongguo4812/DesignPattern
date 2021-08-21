package com.dongguo.principle.segregation.segregation2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-20:31
 * @description:
 */
public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); // A 类通过接口去依赖B 类
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D()); // C 类通过接口去依赖(使用)D 类
        c.depend2(new D());
        c.depend3(new D());
    }
}
