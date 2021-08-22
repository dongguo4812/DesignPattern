package com.dongguo.flyweight;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:50
 * @description:
 */
public class User {
    private String name;
    public User(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}