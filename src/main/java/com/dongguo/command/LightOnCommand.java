package com.dongguo.command;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:00
 * @description:
 */
public class LightOnCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;
    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }
    @Override
    public void execute() {
//调用接收者的方法
        light.on();
    }
    @Override
    public void undo() {
//调用接收者的方法
        light.off();
    }
}