package com.dongguo.observer.观察者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public abstract class AbstractFans {
    abstract void acceptMsg(String msg);
    void follow(AbstractTikToker tikToker){
        tikToker.addFans(this);
    }
}
