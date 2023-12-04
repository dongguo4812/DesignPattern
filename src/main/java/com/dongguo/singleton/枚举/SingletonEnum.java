package com.dongguo.singleton.枚举;

/**
 * @Author: Administrator
 * @Date: 2023-12-04
 */
public enum SingletonEnum {
    INSTANCE;

    private Singleton instance;
    SingletonEnum() {
        instance = new Singleton();
    }
    public Singleton getInstance(){
        return INSTANCE.instance;
    }
}
