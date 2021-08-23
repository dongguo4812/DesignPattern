package com.dongguo.observer;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:07
 * @description: 观察者接口，有观察者来实现
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}



