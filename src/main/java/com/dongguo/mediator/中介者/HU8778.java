package com.dongguo.mediator.中介者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description: 海南8778
 */
public class HU8778 extends Captain{

    @Override
    void fly() {
        System.out.println("HU8778请求起飞");
        controllerTower.acceptRequest("fly");
    }

    @Override
    void land() {
        System.out.println("HU8778请求降落");
        controllerTower.acceptRequest("land");
    }

    @Override
    void success() {
        System.out.println("HU8778完成飞行");
        controllerTower.acceptRequest("success");
    }
}
