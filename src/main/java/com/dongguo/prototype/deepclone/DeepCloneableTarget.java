package com.dongguo.prototype.deepclone;

import java.io.Serializable;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:53
 * @description:
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;



    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String , 因此我们这里使用默认的clone 完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}