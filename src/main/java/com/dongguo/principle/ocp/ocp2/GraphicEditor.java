package com.dongguo.principle.ocp.ocp2;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:31
 * @description: 这是一个用于绘图的类[使用方]
 */
public class GraphicEditor {
    //接收Shape 对象，调用draw 方法
    public void drawShape(Shape s) {
        s.draw();
    }
}