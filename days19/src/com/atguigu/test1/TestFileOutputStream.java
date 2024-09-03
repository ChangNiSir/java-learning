package com.atguigu.test1;

import java.io.File;
import java.io.FileOutputStream;

public class TestFileOutputStream {
    public static void main(String[] args) {
        try{
            File file = new File("days19\\file\\test.txt");
            if(!file.exists()){
                file.createNewFile();// 需求要求创建文件
            }
            // 追加的方式输出，默认覆盖
            // FileOutputStream fos = new FileOutputStream(file,true);
            FileOutputStream fos = new FileOutputStream(file);

            // fos.write(99);// 一次输出一个字节

            String word = "白日依山尽，\n黄河入海流！";
            byte[] datas = word.getBytes();// String -> byte[]（String转（二进制）字节流）

            fos.write(datas);// 传入字节数组
            fos.write(datas);
            fos.write(datas);




            // fos.close();


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
