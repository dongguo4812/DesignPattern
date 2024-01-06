package com.dongguo.observer.观察者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
        MMTikToker mmTikToker = new MMTikToker();


        HumanFans humanFans = new HumanFans();
        humanFans.follow(mmTikToker);

        mmTikToker.notifyFans("我开播了哦");

        mmTikToker.startSell();

        mmTikToker.endSell();

        mmTikToker.notifyFans("明天见喽");
    }
}
