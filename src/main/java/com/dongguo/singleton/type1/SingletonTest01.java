package com.dongguo.singleton.type1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-8:31
 * @description:
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //判断是否是同一个实例对象
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}