package com.dongguo.flyweight.享元;

import lombok.AllArgsConstructor;

/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{
    String id;

    String name;

    Integer age;
    //是否可以服务
    boolean canService;
    @Override
    void service() {
        System.out.println("工号"+ id + "姓名" + name + "年龄" + age + "为您正在服务");
        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("工号"+ id + "姓名" + name + "年龄" + age + "完成服务");
        this.canService = true;
    }
}
