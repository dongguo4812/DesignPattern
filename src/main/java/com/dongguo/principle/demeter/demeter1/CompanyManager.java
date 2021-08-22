package com.dongguo.principle.demeter.demeter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:46
 * @description: 总公司管理者 获得所有员工的信息
 */
public class CompanyManager {

    /**
     * @author Dongguo
     * @description: 获得总公司的员工信息
     */
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
     * @author Dongguo
     * @description: 所有员工的id
     */
    public void printAllEmployee(SubCompanyManager sub){
        List<SubEmployee> list1 = sub.getAllEmployee();
        System.out.println("分公司员工id:");
        for(SubEmployee e:list1){
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("总公司员工id:");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}
