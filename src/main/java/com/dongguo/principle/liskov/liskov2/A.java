package com.dongguo.principle.liskov.liskov2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:27
 * @description:
 */
public class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}