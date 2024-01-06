package com.dongguo.memento;



import cn.hutool.core.bean.BeanUtil;
import lombok.Data;



import java.util.Random;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
@Data
public class NewGame {
    //剩余金币
    Integer coin;
    //血量
    Integer hp;
    //蓝量
    Integer mp;
    //等级
    Integer level;

    GameServer gameServer = new GameServer();

    void saveGameRecord() {
        System.out.println("保存当前记录");
        GameRecord gameRecord = BeanUtil.copyProperties(this, GameRecord.class);
        gameServer.addRecord(gameRecord);
    }

    NewGame getFromMemento(Integer id){
        System.out.println("获取历史存档");
        return gameServer.getRecord(id);

    }

    void playGame() {
        System.out.println("游戏开始");
        Integer i = new Random().nextInt();
        coin = i;
        hp = i;
        mp = i;
        level = i;
        System.out.println("当前游戏信息: 金币" + coin + "血量" + hp + "蓝量" + mp + "等级" + level);
    }

    void exitGame() throws Exception {
        System.out.println("退出游戏");
        //存档
        saveGameRecord();
    }

    @Override
    public String toString() {
        return "NewGame{" +
                "coin=" + coin +
                ", hp=" + hp +
                ", mp=" + mp +
                ", level=" + level +
                '}';
    }
}
