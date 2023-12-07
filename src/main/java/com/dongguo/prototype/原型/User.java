package com.dongguo.prototype.原型;


/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class User implements Cloneable{
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone(){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
