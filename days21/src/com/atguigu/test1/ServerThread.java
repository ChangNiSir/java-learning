package com.atguigu.test1;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            User user = (User)ois.readObject();
            ResultInfo resultInfo = new ResultInfo();// 注意作用域
            if(new UserService().checkUserLogin(user)){// 使用用户服务类
                resultInfo.setFlag(true);
                resultInfo.setInfo("恭喜你登录成功");
            }else{
                resultInfo.setFlag(false);
                resultInfo.setInfo("用户名或密码错误");
            }
            socket.shutdownInput();// 关闭输入流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(resultInfo);
            oos.flush();
            oos.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
