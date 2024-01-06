package com.dongguo.memento;

import lombok.Data;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
@Data
public class GameRecord {
    Integer id;
    //剩余金币
    Integer coin;
    //血量
    Integer hp;
    //蓝量
    Integer mp;
    //等级
    Integer level;

    void getCurrent(){
        System.out.println("当前游戏记录:存档"+ id+" 金币" + coin + "血量" + hp + "蓝量" + mp + "等级" + level);
    }
}
