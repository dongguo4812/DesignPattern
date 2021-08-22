package com.dongguo.principle.demeter.demeter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:58
 * @description:
 */
public class CompanyManager {

    public List<Employee> getAllEmployee(){

        List<Employee> list = new ArrayList<Employee>();
        for(int i=0; i<30; i++){
            Employee emp = new Employee();
            //为总公司人员按顺序分配一个ID
            emp.setId("总公司"+i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 总公司员工的id
     * @param sub
     */
    public void printAllEmployee(SubCompanyManager sub){
        //获得分公司员工的id
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("总公司员工id:");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}