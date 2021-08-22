package com.dongguo.proxy.cglib;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-17:54
 * @description:
 */
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中， 我是cglib 代理，不需要实现接口");
        return "hello";
    }
}