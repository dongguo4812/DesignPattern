package com.dongguo.flyweight.享元;

/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractWaitressFlyweight zhangsna = HaiDiLao.getWaitress("张三");
        zhangsna.service();
        AbstractWaitressFlyweight lisi = HaiDiLao.getWaitress("李四");
        lisi.service();
        lisi.end();
        AbstractWaitressFlyweight wangwu = HaiDiLao.getWaitress("王五");
        wangwu.service();
    }
}
