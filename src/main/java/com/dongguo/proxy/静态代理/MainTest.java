package com.dongguo.proxy.静态代理;

/**
 * @Author: Administrator
 * @Date: 2023-12-20
 */
public class MainTest {
    public static void main(String[] args) {
        LiTikTokProxy proxy = new LiTikTokProxy(new DongTikTok());
        proxy.tiktok();
    }
}
