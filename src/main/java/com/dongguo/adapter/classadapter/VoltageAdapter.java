package com.dongguo.adapter.classadapter;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-12:58
 * @description: 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage18V {
    @Override
    public int output18V() {

        //获取到220V 电压
        int srcV = output220V();
        int dstV = srcV / 12 ; //转成18v
        return dstV;
    }
}