package com.dongguo.singleton.枚举;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 */
public class Singleton {
    Singleton() {
        System.out.println("私有构造函数");
    }
    public static Singleton getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }
}
