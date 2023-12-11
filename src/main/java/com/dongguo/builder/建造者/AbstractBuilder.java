package com.dongguo.builder.建造者;

/**
 * @Author: Administrator
 * @Date: 2023-12-11
 */
public abstract class AbstractBuilder {
    Phone phone;

    abstract void customCpu(String cpu);
    abstract void customMem(String mem);
    abstract void customDisk(String disk);
    abstract void customCam(String cam);

    public Phone getProduct(){
        return phone;
    }
}
