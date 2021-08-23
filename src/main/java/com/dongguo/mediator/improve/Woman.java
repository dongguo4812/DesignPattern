package com.dongguo.mediator.improve;

/**
 * @author Dongguo
 * @date 2021/8/23 0023-9:35
 * @description:
 */
public class Woman extends Person{
    public  Woman(String name,int condition,Mediator mediator){
        super(name,condition,mediator);
    }

    @Override
    public void getPartner(Person person) {
        this.getMediator().setWoman(this);
        this.getMediator().getPartner(person);
    }
}