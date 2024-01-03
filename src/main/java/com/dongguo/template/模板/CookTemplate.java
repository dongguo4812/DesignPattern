package com.dongguo.template.模板;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public abstract class CookTemplate {
    /**
     * 定义炒菜步骤
     * 父类实现某些步骤，关键步骤由子类实现
     */
    public void cook(){
        heating();
        addFood();
        addSalt();
        stirFry();
        end();
    }

    public void heating(){
        System.out.println("开火加热...");
    }
    public abstract void addFood();

    public abstract void addSalt();

    public void stirFry(){
        System.out.println("翻炒");
    }
    public void end(){
        System.out.println("出锅");
    }
}
