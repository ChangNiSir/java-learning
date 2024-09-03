package com.atguigu.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        // 客户端
        try {
            // 127.0.0.1
            Socket socket = new Socket("localhost",8888);
            // 字节节点流 -> 字符处理流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，我是客户端");
            bw.flush();
            // bw.close()会导致socket关闭
            socket.shutdownOutput();// 一招吃遍鲜（不考虑自动开启输入流）
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String word = br.readLine();
            System.out.println("服务器回答："+word);
            br.close();
            socket.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
