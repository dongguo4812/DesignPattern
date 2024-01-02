package com.dongguo.composite.组合;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2024-01-02
 */
@Data

public class Menu {
    private Integer id;
    private String name;

    private List<Menu> childs = new ArrayList<>();

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 添加层级
     * @param menu
     */
    void  addChild(Menu menu){
        childs.add(menu);
    }

    /**
     * 层级遍历
     */
    void  printMenu(){
        printMenu(0);
    }

    /**
     * 层级遍历
     * @param level 当前菜单的层级
     */
    void printMenu(int level) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("--");
        }
        System.out.println(prefix + name);
        for (Menu child : childs) {
            child.printMenu(level + 1);
        }
    }
}
