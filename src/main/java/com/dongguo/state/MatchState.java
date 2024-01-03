package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class MatchState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("全力以赴打比赛");
    }

    @Override
    public TeamState next() {
        return null;
    }
}
