package com.atguigu.test2;

import java.io.*;
import java.nio.file.Files;

public class TestTwo {
    public static void main(String[] args) {     // 转换流
        try {
            File file = new File("days19\\file\\hello.txt");
            // 两个处理流 + 一个节点流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
//            bw.write("你好，劳大！");
//            bw.flush();// flush的必要性---清空缓冲区输出数据

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
