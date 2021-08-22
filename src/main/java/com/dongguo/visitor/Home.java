package com.dongguo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongguo
 * @date 2021/8/22 0022-20:59
 * @description: 结构对象角色类 -- 主人家
 */

public class Home {
    private List<Animal> nodeList = new ArrayList<>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    /**
     * 添加操作
     * @param animal
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}