package com.dongguo.interpreter.解释器;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public abstract class IDCardExpression {
    /**
     * 城市:姓名-其他
     * 上海市:张三-军人
     * @param expression
     * @return
     */
    abstract boolean interpret(String expression);
}
