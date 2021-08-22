package com.dongguo.singleton.type4;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:41
 * @description: 懒汉式(线程安全，同步方法)
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}