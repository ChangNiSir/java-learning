package com.atguigu.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        // 客户端：客户端与服务器端双向多次通信
        try {
            Socket socket = new Socket("localhost",8888);// 客户端请求
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，服务器，我是客户端，我向你发送了一条消息");
            bw.flush();
            socket.shutdownOutput();// 关闭输出流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String answer = br.readLine();
            System.out.println("这里是客户端，服务器的响应信息是：" + answer);
            br.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
