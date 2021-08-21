package com.dongguo.principle.singleresponsibility2;


/**
 * @author Dongguo
 * @date 2021/8/21 0021-19:27
 * @description:
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}