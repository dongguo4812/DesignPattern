package com.dongguo.observer;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:05
 * @description: 接口, 让WeatherData 来实现
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}