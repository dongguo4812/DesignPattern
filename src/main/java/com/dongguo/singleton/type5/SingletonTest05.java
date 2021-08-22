package com.dongguo.singleton.type5;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:44
 * @description:
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("懒汉式3 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}