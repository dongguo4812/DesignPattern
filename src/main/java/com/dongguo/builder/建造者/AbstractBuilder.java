package com.dongguo.builder.建造者;

/**
 * @Author: Administrator
 * @Date: 2023-12-11
 */
public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);

    public Phone getProduct(){
        return phone;
    }
}
