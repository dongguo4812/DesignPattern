package com.dongguo.principle.inversioninversion.inversioninversion3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:49
 * @description: TV的实现类
 */
public class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}