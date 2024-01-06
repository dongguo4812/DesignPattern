package com.dongguo.memento;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class GameServer {
    Map<Integer, GameRecord> recordMap = new HashMap<>();
    Integer i = 1;
    void addRecord(GameRecord record){
        record.setId(i++);
        recordMap.put(record.id, record);
    }

    NewGame getRecord(Integer id){
        GameRecord gameRecord = recordMap.get(id);
        if (ObjectUtil.isNotEmpty(gameRecord)){
            return  BeanUtil.copyProperties(gameRecord, NewGame.class);
        }
        return null;
    }
}
