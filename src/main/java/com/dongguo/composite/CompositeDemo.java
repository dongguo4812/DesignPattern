package com.dongguo.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-15:27
 * @description:
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"张三");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"李四");
        map.put(2,"王五");
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}