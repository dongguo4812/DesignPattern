package com.dongguo.builder;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:28
 * @description: 普通房子
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基");
    }

    @Override
    public void buildWalls() {

        System.out.println(" 普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶");
    }
}