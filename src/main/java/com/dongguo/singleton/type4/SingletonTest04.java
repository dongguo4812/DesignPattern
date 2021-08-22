package com.dongguo.singleton.type4;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:42
 * @description:
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}