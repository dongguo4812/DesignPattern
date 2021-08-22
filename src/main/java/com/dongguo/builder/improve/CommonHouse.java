package com.dongguo.builder.improve;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:40
 * @description:
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {

        System.out.println(" 普通房子打地基5 米");
    }
    @Override
    public void buildWalls() {

        System.out.println(" 普通房子砌墙10cm ");
    }
    @Override
    public void roofed() {

        System.out.println(" 普通房子屋顶");
    }
}