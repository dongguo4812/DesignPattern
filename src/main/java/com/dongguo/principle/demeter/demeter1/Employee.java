package com.dongguo.principle.demeter.demeter1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:42
 * @description: 总公司员工
 */
public class Employee {
    private String id;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}