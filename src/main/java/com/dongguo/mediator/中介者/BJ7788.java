package com.dongguo.mediator.中介者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class BJ7788 extends Captain{

    @Override
    void fly() {
        System.out.println("BJ7788请求起飞");
        controllerTower.acceptRequest("fly");
    }

    @Override
    void land() {
        System.out.println("BJ7788请求降落");
        controllerTower.acceptRequest("land");
    }

    @Override
    void success() {
        System.out.println("BJ7788完成请求");
        controllerTower.acceptRequest("success");
    }
}
