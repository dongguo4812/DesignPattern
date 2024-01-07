package com.dongguo.command.命令;

/**
 * @author dongguo
 * @date 2024/1/7
 * @description:
 */
public class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
