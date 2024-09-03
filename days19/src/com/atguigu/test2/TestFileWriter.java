package com.atguigu.test2;

import java.io.*;

public class TestFileWriter {
    public static void main(String[] args) {
        // 字符流
        try {
            File file = new File("days19\\file\\test1.txt");
            if(file.exists()){
                file.createNewFile();
            }
            // 字符输出处理流（带缓冲区）---使用字符输入节点流创建对象
            // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("days19\\file\\test1.txt"));
            // 加追加模式---节点流
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write("古之所谓豪杰之士者，必有过人之节。");
            bufferedWriter.newLine();// 换行
            bufferedWriter.write("人情有所不能忍者，匹夫见辱，拔剑而起，挺身而斗，此不足为勇也。");
            bufferedWriter.flush();// 清空缓冲区---需要输出数据
            bufferedWriter.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
