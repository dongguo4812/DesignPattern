package com.dongguo.singleton.type7;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:49
 * @description:
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}