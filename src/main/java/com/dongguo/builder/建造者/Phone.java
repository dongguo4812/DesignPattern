package com.dongguo.builder.建造者;

/**
 * @Author: Administrator
 * @Date: 2023-12-11
 */
public class Phone {
    //cpu
    protected String cpu;
    //内存
    protected String mem;
    //磁盘
    protected String disk;
    //相机
    protected String cam;

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}

