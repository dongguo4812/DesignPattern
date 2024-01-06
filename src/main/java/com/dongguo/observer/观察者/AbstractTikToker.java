package com.dongguo.observer.观察者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public abstract class AbstractTikToker {
    abstract void addFans(AbstractFans fans);

    abstract void notifyFans(String msg);
}
