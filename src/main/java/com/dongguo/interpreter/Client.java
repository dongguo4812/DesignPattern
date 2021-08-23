package com.dongguo.interpreter;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:49
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        String number="10";
        Context context=new Context(number);
        //递增
        Expression expression=new PlusExpression();
        expression.interpret(context);
        System.out.println(context.getOutput());
        //递减
        Expression expression1=new MinusExpression();
        expression1.interpret(context);
        System.out.println(context.getOutput());
    }
}