package com.dongguo.iterator;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-21:54
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        List list=new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}