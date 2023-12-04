package com.dongguo.singleton.饿汉式;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 * 饿汉式
 */
public class Singleton {
    private Singleton(){
        System.out.println("私有构造函数");
    }
    private static final Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
