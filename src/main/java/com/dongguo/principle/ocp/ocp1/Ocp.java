package com.dongguo.principle.ocp.ocp1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:23
 * @description:
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}