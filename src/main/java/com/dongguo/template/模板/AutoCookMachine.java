package com.dongguo.template.模板;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class AutoCookMachine extends CookTemplate{
    @Override
    public void addFood() {
        System.out.println("放入白菜、辣椒、肉");
    }

    @Override
    public void addSalt() {
        System.out.println("放入10克盐");
    }
}
