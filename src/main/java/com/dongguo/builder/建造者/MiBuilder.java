package com.dongguo.builder.建造者;

/**
 * @Author: Administrator
 * @Date: 2023-12-11
 */
public class MiBuilder extends AbstractBuilder{
    public MiBuilder() {
        phone = new Phone();
    }

    @Override
    void customCpu(String cpu) {
        phone.cpu = cpu;
    }

    @Override
    void customMem(String mem) {
        phone.mem = mem;
    }

    @Override
    void customDisk(String disk) {
        phone.disk = disk;
    }

    @Override
    void customCam(String cam) {
        phone.cam = cam;
    }
}
