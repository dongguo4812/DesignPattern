package com.dongguo.principle.liskov.liskov2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:27
 * @description:
 */
public class B extends Base {
    //如果B 需要使用A 类的方法,使用组合关系
    private A a = new A();

    //这里，重写了A 类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用A 的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}