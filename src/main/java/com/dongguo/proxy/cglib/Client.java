package com.dongguo.proxy.cglib;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-17:54
 * @description:
 */
public class Client {
    public static void main(String[] args) {

//创建目标对象
        TeacherDao target = new TeacherDao();
//获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
//执行代理对象的方法，触发intecept 方法，从而实现对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }
}