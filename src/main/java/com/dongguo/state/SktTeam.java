package com.dongguo.state;

/**
 * @Author: Administrator
 * @Date: 2024-01-03
 */
public class SktTeam {
    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    public void startGame(){
        teamState.playGame();
    }

    public void nextState(){
        teamState = teamState.next();
    }
}
