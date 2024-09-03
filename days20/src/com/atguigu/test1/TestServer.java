package com.atguigu.test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {
    public static void main(String[] args) {
        // 服务器端：客户端与服务器双向单次通讯String
        try {
            ServerSocket ss = new ServerSocket(8888);// 指定所占用的端口号
            Socket socket = ss.accept();// 监听客户端请求，返回Socket对象（客户端信息）
            // 程序和网络通讯---TCP
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String word = br.readLine();
            System.out.println("这里是服务器，客户端请求信息是：\n" + word);
            socket.shutdownInput();// 关闭输入流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，客户端，我是服务器，我收到了你的消息");
            bw.flush();
            bw.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
