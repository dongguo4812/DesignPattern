package com.dongguo.principle.ocp.ocp2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:29
 * @description:
 */
public class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形");
    }
}