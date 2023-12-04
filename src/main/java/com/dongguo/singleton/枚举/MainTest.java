package com.dongguo.singleton.枚举;

import java.sql.SQLOutput;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 */
public class MainTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance1);
    }

}
