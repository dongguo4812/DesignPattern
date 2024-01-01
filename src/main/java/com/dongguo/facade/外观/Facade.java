package com.dongguo.facade.外观;

/**
 * @author dongguo
 * @date 2023/12/31
 * @description:
 */
public class Facade {
    Police police = new Police();
    Edu edu = new Edu();
    Social social = new Social();
    public void HandleAll(String name){
        police.register(name);
        edu.assignSchool(name);
        social.handleSocial(name);
    }
}
