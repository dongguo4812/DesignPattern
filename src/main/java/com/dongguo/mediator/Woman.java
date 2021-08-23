package com.dongguo.mediator;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:31
 * @description:
 */
public class Woman extends Person{
    public  Woman(String name,int condition){
        super(name,condition);
    }

    @Override
    public void getPartner(Person person) {
        if (person instanceof Woman){
            System.out.println("我不喜欢女的");
        }else {
            if (this.getCondition() == person.getCondition()){
                System.out.println("门当户对");
            }else {
                System.out.println("不相配");
            }
        }
    }
}