package com.dongguo.principle.inversioninversion.inversioninversion2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:34
 * @description:
 */
public class DependecyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}