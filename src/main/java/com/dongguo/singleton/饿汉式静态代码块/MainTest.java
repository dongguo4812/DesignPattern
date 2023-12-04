package com.dongguo.singleton.饿汉式静态代码块;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 */
public class MainTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2 == singleton1);
    }
}
