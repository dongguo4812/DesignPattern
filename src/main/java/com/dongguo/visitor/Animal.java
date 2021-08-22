package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:57
 * @description: 抽象节点（元素）角色 -- 宠物
 */
public abstract class Animal {
    //吃食操作
    public abstract void accept(Person person);
}