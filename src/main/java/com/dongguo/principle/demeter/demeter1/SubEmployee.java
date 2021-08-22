package com.dongguo.principle.demeter.demeter1;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:43
 * @description: 分公司员工
 */
public class SubEmployee {
    private String id;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}
