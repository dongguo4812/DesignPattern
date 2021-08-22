package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:58
 * @description: 具体节点（元素）角色 -- 宠物猫
 */
public class Cat extends Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫粮好好吃，喵喵喵！！！");
    }
}