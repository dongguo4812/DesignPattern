package com.dongguo.builder.improve;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:40
 * @description:
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {

        System.out.println(" 高楼的打地基100 米");
    }
    @Override
    public void buildWalls() {

        System.out.println(" 高楼的砌墙20cm ");
    }
    @Override
    public void roofed() {

        System.out.println(" 高楼的透明屋顶");
    }
}