package com.dongguo.principle.inversioninversion.inversioninversion5;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:07
 * @description:
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //通过setter 方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();

    }
}