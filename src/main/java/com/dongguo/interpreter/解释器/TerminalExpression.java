package com.dongguo.interpreter.解释器;

import java.util.Set;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class TerminalExpression extends IDCardExpression{
    /**
     * 数据
     */
    Set<String> data;
    /**
     * 解析符号
     */
    String symbol;

    public TerminalExpression(Set<String> data,  String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpret(String expression) {
        String[] split = expression.split(symbol);
        for (String s : split) {
            if (data.contains(s)){
                return true;
            }
        }
        return false;
    }
}
