package com.dongguo.principle.ocp.ocp2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:30
 * @description: 新增画三角形
 */
public class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形");
    }
}