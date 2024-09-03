package com.atguigu.test;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    // 考虑安全性
    private Socket socket;
    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String word = br.readLine();
            System.out.println("客户端请求："+word);
            socket.shutdownInput();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，我是服务器，收到了你的消息");
            bw.flush();
            bw.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
