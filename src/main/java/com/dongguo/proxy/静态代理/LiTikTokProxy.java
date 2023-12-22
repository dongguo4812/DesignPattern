package com.dongguo.proxy.静态代理;

/**
 * @Author: Administrator
 * @Date: 2023-12-20
 */
public class LiTikTokProxy implements ManTikTok{
    private ManTikTok manTikTok;

    public LiTikTokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    public void tikTokProxy(){

    }
    @Override
    public void tiktok() {
        System.out.println("Li 模仿 Dong");
        System.out.println("Li 开启变声器，进行直播");
        manTikTok.tiktok();
    }
}
