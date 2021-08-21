package com.dongguo.principle.inversioninversion.inversioninversion5;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:06
 * @description:
 */
public class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}