package com.dongguo.prototype.原型;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Administrator
 * @Date: 2023-12-05
 */
public class UserService {
    private static Map<String, User> userMap = new HashMap<>();

    public static User getUser(String name) {
        User user;
        if (userMap.containsKey(name)) {
            user = userMap.get(name);
        } else {
            user = getUserFromDb(name);
        }
        return (User) user.clone();
    }

    private static User getUserFromDb(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(18);
        userMap.put(name, user);
        return user;
    }
}
