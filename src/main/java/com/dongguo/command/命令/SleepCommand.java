package com.dongguo.command.命令;

import lombok.Data;

/**
 * @author dongguo
 * @date 2024/1/7
 * @description:
 */
@Data
public class SleepCommand implements Command{
    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        System.out.println("去睡觉");
        receiver.sleep();
    }
}
