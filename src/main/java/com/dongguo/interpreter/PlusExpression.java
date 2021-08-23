package com.dongguo.interpreter;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:48
 * @description: 递增解释器
 */
public class PlusExpression extends Expression {

    public void interpret(Context context){
        System.out.println("自动递增");
        //获得上下文环境
        String input=context.getInput();
        //进行类转换
        int intput=Integer.parseInt(input);
        ++intput;
        //对上下文环境重新进行复制
        context.setInput(String.valueOf(intput));
        context.setOutput(intput);
    }
}