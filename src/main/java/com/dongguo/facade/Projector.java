package com.dongguo.facade;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:14
 * @description: 投影仪
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }
    //聚焦
    public void focus() {
        System.out.println(" Projector is Projector ");
    }
//...
}