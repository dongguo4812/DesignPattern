package com.dongguo.singleton.type7;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:48
 * @description: 静态内部类完成， 推荐使用
 */
public class Singleton {
    private static volatile Singleton instance;

    //构造器私有化
    private Singleton() {
    }

    //写一个静态内部类,该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}