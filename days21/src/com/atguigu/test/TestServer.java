package com.atguigu.test;

import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        // 服务器
        try {
            ServerSocket ss = new ServerSocket(8888);
            while(true){
                Socket socket = ss.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
