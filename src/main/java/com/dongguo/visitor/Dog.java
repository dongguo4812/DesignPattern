package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:58
 * @description: 具体节点（元素）角色 -- 宠物狗
 */
public class Dog extends Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗粮好好吃，汪汪汪！！！");
    }
}