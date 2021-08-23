package com.dongguo.observer;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:08
 * @description:
 */
public class BaiduSite implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气情况，是由WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("===百度网站====");
        System.out.println("***百度网站气温: " + temperature + "***");
        System.out.println("***百度网站气压: " + pressure + "***");
        System.out.println("***百度网站湿度: " + humidity + "***");
    }
}