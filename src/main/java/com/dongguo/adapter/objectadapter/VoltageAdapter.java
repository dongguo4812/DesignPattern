package com.dongguo.adapter.objectadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-13:03
 * @description:
 */
public class VoltageAdapter implements IVoltage18V {
    private Voltage220V voltage220V; // 关联关系-聚合

    //通过构造器，传入一个Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }
    @Override
    public int output18V() {
        int dst = 0;
        if(null != voltage220V) {
            int src = voltage220V.output220V();//获取220V 电压
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 12;

            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}