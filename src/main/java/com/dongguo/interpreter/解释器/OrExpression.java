package com.dongguo.interpreter.解释器;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class OrExpression extends IDCardExpression{

    private IDCardExpression cityExp;
    private IDCardExpression typeExp;

    public OrExpression(IDCardExpression cityExp, IDCardExpression typeExp) {
        this.cityExp = cityExp;
        this.typeExp = typeExp;
    }

    @Override
    boolean interpret(String expression) {
        return cityExp.interpret(expression) || typeExp.interpret(expression);
    }
}
