package com.dongguo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-14:58
 * @description: 大学
 */
public class College extends OrganizationComponent {
    //List 中存放的Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
    // 构造器
    public College(String name, String des) {
        super(name, des);
    }
    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {

// 将来实际业务中，Colleage 的add 和University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }
    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDes() {
        return super.getDes();
    }
    // print 方法，就是输出University 包含的学院
    @Override
    protected void print() {

        System.out.println("--------------" + getName() + "--------------");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}