package com.dongguo.command.命令;

/**
 * @author dongguo
 * @date 2024/1/7
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
       Invoker invoker = new Invoker();
       invoker.setCommand(new SleepCommand());
       invoker.call();
    }
}
