package com.dongguo.strategy;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class MainTest {
    public static void main(String[] args) {
        TeamGNR gnr = new TeamGNR();
        gnr.setGameStrategy(new UziStrategy());
        gnr.gameStart();
    }
}
