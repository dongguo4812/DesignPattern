package com.dongguo.proxy.dynamic;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-17:28
 * @description:
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {

        System.out.println(" 老师授课中.... ");
    }
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}