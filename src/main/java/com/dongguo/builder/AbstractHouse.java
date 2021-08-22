package com.dongguo.builder;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:27
 * @description:
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}