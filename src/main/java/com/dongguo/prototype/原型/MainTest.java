package com.dongguo.prototype.原型;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class MainTest {
    public static void main(String[] args) {
        User zhangsan = UserService.getUser("zhangsan");
        System.out.println(zhangsan);
        zhangsan.setName("lisi");
        User zhangsan2 = UserService.getUser("zhangsan");
        System.out.println(zhangsan2);
        User zhangsan3 = UserService.getUser("zhangsan");
        System.out.println(zhangsan3);
        User zhangsan4 = UserService.getUser("zhangsan");
        System.out.println(zhangsan4);
    }
}
