package com.dongguo.principle.demeter.demeter2;


/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:50
 * @description:
 */
public class Demeter {
    public static void main(String[] args){
        //创建了一个CompanyManager 对象
        CompanyManager e = new CompanyManager();
        //输出分公司的员工id 和总公司的员工id
        e.printAllEmployee(new SubCompanyManager());
    }
}