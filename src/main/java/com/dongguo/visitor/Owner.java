package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:56
 * @description: 具体访问者角色 -- 主人
 */
public class Owner extends Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}