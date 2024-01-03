package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class EatState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("吃饭中----");
    }

    @Override
    public TeamState next() {
            return new  MatchState();
    }
}
