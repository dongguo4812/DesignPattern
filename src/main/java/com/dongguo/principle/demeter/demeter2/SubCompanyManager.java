package com.dongguo.principle.demeter.demeter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:57
 * @description:
 */
public class SubCompanyManager {

    public List<SubEmployee> getAllEmployee(){
        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for(int i=0; i<100; i++){
            SubEmployee emp = new SubEmployee();
            //为分公司人员按顺序分配一个ID
            emp.setId("分公司"+i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 分公司员工的id
     */
    public void printEmployee(){
        List<SubEmployee> list = this.getAllEmployee();
        System.out.println("分公司员工id:");
        for(SubEmployee e:list){
            System.out.println(e.getId());
        }
    }
}
