package com.dongguo.command;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-19:59
 * @description:
 */
public class LightOffCommand implements Command {

    // 聚合LightReceiver
    LightReceiver light;
    // 构造器
    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }
    @Override
    public void execute() {
// 调用接收者的方法
        light.off();
    }
    @Override
    public void undo() {
// 调用接收者的方法
        light.on();
    }
}