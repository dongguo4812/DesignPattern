package com.dongguo.principle.inversioninversion.inversioninversion3;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:49
 * @description: 开关的接口， 通过接口传递实现依赖
 */
public interface IOpenAndClose {
    public void open(ITV tv); //抽象方法,接收接口
}