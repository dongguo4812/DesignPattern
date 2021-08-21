package com.dongguo.principle.inversioninversion.inversioninversion2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:33
 * @description: 接收weixin信息
 */
public class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}