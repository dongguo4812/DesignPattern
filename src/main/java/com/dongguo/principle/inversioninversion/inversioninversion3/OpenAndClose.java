package com.dongguo.principle.inversioninversion.inversioninversion3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:50
 * @description: 实现IOpenAndClose接口
 */
public class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}