package com.dongguo.template.improve;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-18:39
 * @description:
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}