package com.dongguo.principle.inversioninversion.inversioninversion4;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:03
 * @description:
 */
public class OpenAndClose implements IOpenAndClose {
    public ITV tv; //成员

    public OpenAndClose(ITV tv) { //构造方法
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}