package com.dongguo.singleton.type3;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:39
 * @description: 懒汉式(线程不安全)
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}