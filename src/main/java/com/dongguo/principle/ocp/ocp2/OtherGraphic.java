package com.dongguo.principle.ocp.ocp2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:30
 * @description: 新增一个图形
 */
public class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形");
    }
}