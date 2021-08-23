package com.dongguo.mediator;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:29
 * @description:
 */
public abstract class Person {
    private String name;
    private int condition;//家庭情况级别

    public Person() {
    }

    public Person(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
    public  abstract void  getPartner(Person person);
}
