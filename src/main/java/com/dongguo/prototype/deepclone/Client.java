package com.dongguo.prototype.deepclone;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-11:58
 * @description:
 */
public class Client {
    public static void main(String[] args) throws Exception {

        DeepProtoType p = new DeepProtoType();
        p.name = "张三";
        p.deepCloneableTarget = new DeepCloneableTarget("李四", "people");
        //方式1 重写clone()完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();

        //方式2 序列化完成深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();

        System.out.println( p + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("---------------------------");
        System.out.println(p2 + ",p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
        System.out.println("---------------------------");
        System.out.println(p3 + "p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}