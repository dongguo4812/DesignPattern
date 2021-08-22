package com.dongguo.proxy.staticproxy;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-17:29
 * @description: 代理对象
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target; // 目标对象，通过接口来聚合
    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("开始代理完成某些操作。。。。。");//方法
        target.teach();
        System.out.println("提交。。。。。");//方法

    }
}