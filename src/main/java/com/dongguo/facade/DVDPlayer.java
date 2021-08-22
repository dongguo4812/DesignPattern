package com.dongguo.facade;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:10
 * @description:
 */
public class DVDPlayer {
    //使用单例模式, 使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstanc() {
        return instance;
    }
    //打开
    public void on() {
        System.out.println(" dvd on ");
    }
    //关闭
    public void off() {
        System.out.println(" dvd off ");
    }
    //播放
    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    //暂停
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}