package com.dongguo.flyweight;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:55
 * @description:
 */
public class FlyWeightDemo {
    public static void main(String[] args) {
        //如果Integer.valueOf(x) x 在-128 --- 127 直接，就是使用享元模式返回,如果不在
        //范围类，则仍然new
        //小结:
        //1. 在valueOf 方法中，先判断值是否在IntegerCache 中，如果不在，就创建新的Integer(new), 否则，就
        //        直接从缓存池返回
        //2. valueOf 方法，就使用到享元模式
        //3. 如果使用valueOf 方法得到一个Integer 实例，范围在-128 - 127 ，执行速度比new 快
        Integer x = Integer.valueOf(127); // 得到x 实例，类型Integer
        Integer y = new Integer(127); // 得到y 实例，类型Integer
        Integer z = Integer.valueOf(127);//..
        Integer w = new Integer(127);
        System.out.println(x.equals(y)); // 大小，true
        System.out.println(x == y ); // false
        System.out.println(x == z ); // true
        System.out.println(w == x ); // false
        System.out.println(w == y ); // false
        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1==x2" + (x1 == x2)); // false
    }
}