package com.atguigu.test2;

import java.io.*;

public class TestOne {
    public static void main(String[] args) {
        // 转换流
        try {
            File file = new File("days19\\file\\hello.txt");
            // 字节节点流 -> 字符处理流
            // 1 创建字节节点流
            FileInputStream fis = new FileInputStream(file);
            // 2 字节节点流 -> 字符转换流（Reader）---类处理流
            InputStreamReader isr = new InputStreamReader(fis);
            // 3 字符转换流（与字符节点流等价) -> 字符处理流
            BufferedReader br = new BufferedReader(isr);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
