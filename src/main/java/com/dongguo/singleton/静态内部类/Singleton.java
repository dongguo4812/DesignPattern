package com.dongguo.singleton.静态内部类;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 */
public class Singleton {
    private Singleton(){
        System.out.println("私有构造函数");
    }

    /**
     * 静态代码块
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 静态代码块实现单例和单例类似 这里使用静态方法保证安全性
     * @return
     */
    public static synchronized Singleton getInstance(){
      return SingletonInstance.INSTANCE;
    }
}
