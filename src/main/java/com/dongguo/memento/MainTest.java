package com.dongguo.memento;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class MainTest {
    public static void main(String[] args){
        NewGame game = new NewGame();
        game.playGame();

        game.saveGameRecord();



        game.playGame();
        game.playGame();
        game.saveGameRecord();

        NewGame game1 = game.getFromMemento(1);
        System.out.println(game1);
    }
}
