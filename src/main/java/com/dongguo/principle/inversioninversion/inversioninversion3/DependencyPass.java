package com.dongguo.principle.inversioninversion.inversioninversion3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:51
 * @description:
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}