package com.dongguo.flyweight.享元;

/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
public abstract class AbstractWaitressFlyweight {
    /**
     * 不共享属性  由子类各自实现
     */

    /**
     * 正在服务
     */
    abstract void service();

    /**
     * 服务完成
     */
    abstract void  end();
}
