package com.dongguo.interpreter;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:48
 * @description: 抽象解释器
 */
public abstract class Expression {
    public abstract void interpret(Context context);
}