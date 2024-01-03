package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public interface TeamState {
    void playGame();
    //状态的流转
    TeamState next();
}
