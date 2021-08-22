package com.dongguo.command;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-19:59
 * @description:
 */
public interface Command {
    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}