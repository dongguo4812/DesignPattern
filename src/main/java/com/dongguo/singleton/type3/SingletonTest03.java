package com.dongguo.singleton.type3;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:39
 * @description:
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //判断是否是同一个实例对象/
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}