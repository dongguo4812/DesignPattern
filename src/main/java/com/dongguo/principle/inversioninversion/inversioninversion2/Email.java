package com.dongguo.principle.inversioninversion.inversioninversion2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:34
 * @description: 接收Email信息
 */
public class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}