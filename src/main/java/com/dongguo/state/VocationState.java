package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("正在休假，停赛期");
    }

    @Override
    public TeamState next() {
        return new EatState();
    }
}
