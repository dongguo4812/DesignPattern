package com.dongguo.builder.建造者;

/**
 * @Author: Administrator
 * @Date: 2023-12-11
 */
public class MainTest {
    public static void main(String[] args) {
        MiBuilder miBuilder = new MiBuilder();
        miBuilder.customCpu("高通骁龙680");
        miBuilder.customMem("8GB");
        miBuilder.customDisk("256/512GB");
        miBuilder.customCam("3200万高清自拍");
        Phone product = miBuilder.getProduct();
        System.out.println(product);
    }
}
