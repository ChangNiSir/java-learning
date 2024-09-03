package com.atguigu.test1;

import java.util.List;

public class TestUserService {
    public static void main(String[] args) {
        UserService userService = new UserService();

//        List<User> list =  userService.getAllUser();
//        for (User user : list) {
//            System.out.println(user);
//        }

        User user = new User("Tom","12345678");
        System.out.println(userService.checkUserLogin(user));
    }
}
