package com.dongguo.singleton.type1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:30
 * @description: 饿汉式(静态变量)
 */
public class Singleton {
    //1. 构造器私有化, 外部能new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}