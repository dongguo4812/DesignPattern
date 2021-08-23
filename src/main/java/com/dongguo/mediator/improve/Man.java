package com.dongguo.mediator.improve;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:35
 * @description:
 */
public class Man extends Person {
    public  Man(String name,int condition,Mediator mediator){
        super(name,condition,mediator);
    }

    @Override
    public void getPartner(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPartner(person);
    }
}