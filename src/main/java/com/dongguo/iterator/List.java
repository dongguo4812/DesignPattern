package com.dongguo.iterator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-21:53
 * @description: 定义容器角色(Aggregate)
 */

//定义集合可以进行的操作
public interface List {

    public void add(Object obj);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}