package com.atguigu.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public boolean checkUserLogin(User user){
        boolean flag = false;// 未登录状态---登录失败
        List<User> list = getAllUser();
        for (User currUser : list) {
            if(user.getUserName().equals(currUser.getUserName())
                    &&user.getUserPwd().equals(currUser.getUserPwd())){
                flag = true;
            }
        }
        return flag;
    }

    // 返回泛型的集合
    public List<User> getAllUser(){
        List<User> list = new ArrayList<>();
        try {
            File file = new File("days21\\file\\users.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true){
                String str = br.readLine();
                if(str == null) {
                    break;
                }
                String[] data = str.split("-");
                User user = new User();
                user.setUserName(data[0]);
                user.setUserPwd(data[1]);
                list.add(user);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}
