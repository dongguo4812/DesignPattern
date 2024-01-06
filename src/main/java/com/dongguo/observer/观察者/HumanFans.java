package com.dongguo.observer.观察者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class HumanFans extends AbstractFans{
    @Override
    void acceptMsg(String msg) {
        System.out.println("收到主播发送的消息:" + msg);
    }
}
