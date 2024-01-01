package com.dongguo.facade.外观;


/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.HandleAll("张三");
    }
}
