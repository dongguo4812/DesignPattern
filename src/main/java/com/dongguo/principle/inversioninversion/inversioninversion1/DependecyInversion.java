package com.dongguo.principle.inversioninversion.inversioninversion1;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:14
 * @description:
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}