package com.dongguo.facade;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:14
 * @description: 屏幕
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}