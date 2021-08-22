package com.dongguo.proxy.staticproxy;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-17:28
 * @description:
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中。。。。。");
    }
}