package com.dongguo.singleton.饿汉式静态代码块;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 * 饿汉式静态代码块
 */
public class Singleton {
    private Singleton(){
        System.out.println("私有构造函数");
    }
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
