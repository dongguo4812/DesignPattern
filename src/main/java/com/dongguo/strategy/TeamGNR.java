package com.dongguo.strategy;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 * 环境类
 */
public class TeamGNR {
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void gameStart(){
        System.out.println("游戏开始------");

        //相关策略
        gameStrategy.startGame();

        System.out.println("游戏结束------");
    }
}
