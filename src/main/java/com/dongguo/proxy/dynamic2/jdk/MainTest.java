package com.dongguo.proxy.dynamic2.jdk;


/**
 * @Author: Administrator
 * @Date: 2023-12-20
 */
public class MainTest {
    public static void main(String[] args) {
        ManTikTok tikTok = new DongTikTok();
        ManTikTok proxy = JdkTikTokProxy.getProxy(tikTok);
        proxy.tiktok();
    }
}
