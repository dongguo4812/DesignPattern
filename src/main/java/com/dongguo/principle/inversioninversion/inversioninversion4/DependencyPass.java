package com.dongguo.principle.inversioninversion.inversioninversion4;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:03
 * @description:
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //通过构造器进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();

    }
}