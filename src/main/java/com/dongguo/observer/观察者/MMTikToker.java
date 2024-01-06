package com.dongguo.observer.观察者;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class MMTikToker extends AbstractTikToker{
    private List<AbstractFans> fansList = new ArrayList<>();
    void startSell(){
        System.out.println("开始卖货");
        notifyFans("开始卖货喽");
    }
    void endSell(){
        System.out.println("结束卖货");
        notifyFans("结束卖货啦");
    }
    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    @Override
    void notifyFans(String msg) {
        for (AbstractFans fans : fansList) {
            fans.acceptMsg(msg);
        }
    }
}
