package com.dongguo.mediator.improve;



/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:32
 * @description: 中介者
 */
public class Mediator {
    private Man man;
    private Woman woman;

    public void setMan(Man man) {
        this.man = man;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }
    public void getPartner(Person person){
        //设置相亲对象
        if (person instanceof Man){
            this.setMan((Man) person);
        }else {
            this.setWoman((Woman) person);
        }
        if (man.getCondition() == woman.getCondition()){
            System.out.println("门当户对");
        }else {
            System.out.println("我反对这门亲事");
        }
    }
}