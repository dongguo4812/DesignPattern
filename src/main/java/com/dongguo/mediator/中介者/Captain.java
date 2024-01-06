package com.dongguo.mediator.中介者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:抽象机长
 */
public abstract class Captain {
    ControllerTower controllerTower;

    public void setControllerTower(ControllerTower controllerTower) {
        this.controllerTower = controllerTower;
    }

    //起飞
    abstract void fly();
    //降落
    abstract void land();
    //完成
    abstract void success();
}
