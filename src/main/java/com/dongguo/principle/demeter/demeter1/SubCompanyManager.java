package com.dongguo.principle.demeter.demeter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-7:44
 * @description: 分公司管理者，获得分公司人员信息
 */
public class SubCompanyManager {

    public List<SubEmployee> getAllEmployee() {

        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for (int i = 0; i < 100; i++) {
            SubEmployee emp = new SubEmployee();
            //为分公司人员按顺序分配一个ID
            emp.setId("分公司" + i);
            list.add(emp);

        }
        return list;
    }
}
