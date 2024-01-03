package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class MainTest {
    public static void main(String[] args) {
        SktTeam sktTeam = new SktTeam();
        sktTeam.setTeamState(new VocationState());
        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
    }
}
