package com.dongguo.singleton.懒汉式;

import cn.hutool.core.util.ObjectUtil;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 * 懒汉式
 */
public class Singleton {
    private Singleton(){
        System.out.println("私有构造函数");
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if (ObjectUtil.isEmpty(instance)){
            instance = new Singleton();
        }
        return instance;
    }
}
