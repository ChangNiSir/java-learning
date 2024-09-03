package com.atguigu.test2;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String word = br.readLine();
            System.out.println("这里是服务器，客户端请求信息是：" + word);
            socket.shutdownInput();// 关闭输入流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，客户端，我是服务器，我收到了你的消息");
            bw.flush();
            bw.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
