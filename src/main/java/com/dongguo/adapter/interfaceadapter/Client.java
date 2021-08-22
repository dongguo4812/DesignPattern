package com.dongguo.adapter.interfaceadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:12
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们需要使用接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1 的方法");
            }
        };
        absAdapter.m1();
    }
}