package com.atguigu.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestFileReader {
    public static void main(String[] args) {
        // 字符流
        try{
            File file = new File("days19\\file\\hello.txt");
            // 字符输入节点流（能直接创建流叫节点流）
            FileReader fileReader = new FileReader(file);// 操作char
            // FileReader操作形同FileInputStream
            // 字符输入处理流---功能丰富---带缓冲区---读写效率高
            // 处理流需要节点流创建对象---流类型要对应
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(true){
                String word = bufferedReader.readLine();
                if(word == null) {
                    break;
                }
                System.out.println(word);
            }
            // br -> fr -> String---先关fr的话br无法输入
            bufferedReader.close();
            fileReader.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
