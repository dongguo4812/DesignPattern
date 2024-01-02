package com.dongguo.composite.组合;

/**
 * @Author: Administrator
 * @Date: 2024-01-02
 */
public class MainTest {
    public static void main(String[] args) {
        Menu root = new Menu(1, "系统管理");
        Menu 角色管理 = new Menu(11, "角色管理");
        Menu 用户管理 = new Menu(12, "用户管理");

        root.addChild(角色管理);
        root.addChild(用户管理);

        角色管理.addChild(new Menu(111, "临时角色"));
        角色管理.addChild(new Menu(112, "永久角色"));

        用户管理.addChild(new Menu(121, "游客"));
        用户管理.addChild(new Menu(122, "会员"));

        root.printMenu();
    }
}
