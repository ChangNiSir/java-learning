package com.atguigu.test1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        // 客户端：客户端与服务器端双向多次通信对象---账户登录
        try {
            while(true) {
                Socket socket = new Socket("localhost",6666);// 客户端请求
                // 创建对象处理流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                // 账户登录
                User user = new User();
                Scanner input = new Scanner(System.in);
                System.out.println("请输入用户名：");
                user.setUserName(input.next());
                System.out.println("请输入密码：");
                user.setUserPwd(input.next());
                oos.writeObject(user);
                socket.shutdownOutput();// 关闭输出流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ResultInfo resultInfo = (ResultInfo) ois.readObject();
                // boolean flag = resultInfo.isFlag();
                // String info = resultInfo.getInfo();
                System.out.println(resultInfo.getInfo());
                if (resultInfo.isFlag()) {
                    // 登录成功
                    System.out.println("登录成功");
                    break;
                } else {
                    // 登录失败
                    System.out.println("登录失败");
                }

                ois.close();
                socket.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
