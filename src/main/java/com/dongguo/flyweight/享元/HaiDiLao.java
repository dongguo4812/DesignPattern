package com.dongguo.flyweight.享元;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.ObjectUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
public class HaiDiLao {
    private static Map<String, AbstractWaitressFlyweight> pool = new HashMap<>();
    //初始化员工
    static {
        BeautifulWaitress zhangsan = new BeautifulWaitress("001", "张三", 18, true);
        BeautifulWaitress lisi = new BeautifulWaitress("002", "李四", 20, true);
        pool.put(zhangsan.name, zhangsan);
        pool.put(lisi.name, lisi);
    }

    public static AbstractWaitressFlyweight getWaitress(String name){
        AbstractWaitressFlyweight waitress = pool.get(name);
        if (ObjectUtil.isEmpty(waitress)){
            Collection<AbstractWaitressFlyweight> values = pool.values();
            for (AbstractWaitressFlyweight waitressOne : values) {
                BeautifulWaitress one = (BeautifulWaitress) waitressOne;
                if (one.canService){
                    return one;
                }
            }
        }else {
            return waitress;
        }
        return null;
    }
}
