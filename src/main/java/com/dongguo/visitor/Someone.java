package com.dongguo.visitor;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:57
 * @description: 具体访问者角色 -- 其他人
 */
public class Someone extends Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}