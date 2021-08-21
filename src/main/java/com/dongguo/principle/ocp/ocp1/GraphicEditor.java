package com.dongguo.principle.ocp.ocp1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:21
 * @description: 这是一个用于绘图的类[使用方]
 */
public class GraphicEditor {
    //接收Shape 对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形");
    }

    //绘制圆形
    public void drawCircle(Shape r) {

        System.out.println(" 绘制圆形");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形");
    }
}