package com.atguigu.test3;

import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        // 服务器端：客户端与服务器端的双向多次通讯对象
        try {
            ServerSocket ss = new ServerSocket(8888);// 服务器套接字对象---指定所占用的端口号
            while(true){
                Socket socket = ss.accept();// 监听客户端Socket请求，返回Socket对象（带客户端信息）
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
