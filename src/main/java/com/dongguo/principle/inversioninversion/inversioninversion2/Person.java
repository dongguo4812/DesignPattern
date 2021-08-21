package com.dongguo.principle.inversioninversion.inversioninversion2;

/**
 * @author Dongguo
 * @date 2021/8/21 0021-22:34
 * @description:
 */
public class Person {
    /**
     * @author Dongguo
     * @description: 这里我们是对接口的依赖而非具体实现类
     */
    public void receive(IReceiver receiver ) {
        System.out.println(receiver.getInfo());
    }
}