package com.dongguo.facade;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-16:17
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("----------------");
        homeTheaterFacade.play();
        System.out.println("----------------");
        homeTheaterFacade.end();

    }
}