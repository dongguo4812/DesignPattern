package com.dongguo.interpreter;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:47
 * @description: 上下文环境
 */
public class Context {
    private String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}