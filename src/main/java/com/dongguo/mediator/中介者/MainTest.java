package com.dongguo.mediator.中介者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
        ControllerTower controllerTower = new ControllerTower();
        HU8778 hu8778 = new HU8778();
        BJ7788 bj7788 = new BJ7788();
        hu8778.setControllerTower(controllerTower);
        bj7788.setControllerTower(controllerTower);
        hu8778.fly();
        bj7788.fly();
        hu8778.success();
        bj7788.fly();
    }
}
