package com.dongguo.principle.inversioninversion.inversioninversion5;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-23:06
 * @description: 通过setter 方法传递
 */
public interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}