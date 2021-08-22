package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:55
 * @description: 抽象访问者接口  -- 人
 */
public abstract class Person {
    /**
     * 喂食狗
     */
    public abstract void feed(Cat cat);

    /**
     * 喂食猫
     */
    public abstract void feed(Dog dog);
}