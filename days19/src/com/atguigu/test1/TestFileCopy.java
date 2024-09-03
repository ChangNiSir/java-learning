package com.atguigu.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileCopy {
    public static void main(String[] args) {
        // 文本文件 字节流文件（二进制文件）
        try{
            File fileOne = new File("C:\\Users\\心脏图像的分割和定量分析方法研究_丛金玉.pdf");// ("days19//file//hello.txt");// 源文件
            File fileTwo = new File("C:\\Users\\心脏图像的分割和定量分析方法研究_丛金玉_副本.pdf");// ("days19//file//hello_副本.txt");// 副本文件
            if(!fileTwo.exists())// 要求存在副本文件
                fileTwo.createNewFile();
            FileInputStream fis = new FileInputStream(fileOne);
            FileOutputStream fos = new FileOutputStream(fileTwo);

            // byte[] datas = new byte[(int)(fileOne.length())];
            // (int)(fileOne.length())可能超过int范围

            byte[] datas = new byte[1024];// 默认超过1KB
            while(true){
                int length = fis.read(datas);
                if(length == -1)
                    break;
                fos.write(datas,0,length);// 从datas下标为0处开始读取
            }
            fis.close();
            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
