package com.dongguo.proxy.dynamic2.cglib;

/**
 * @Author: Administrator
 * @Date: 2023-12-22
 */
public class MainTest {
    public static void main(String[] args) {
        DongTikTok tikTok = new DongTikTok();
        DongTikTok proxy = CglibTikTokProxy.createProxy(tikTok);
        proxy.tiktok();
    }
}
