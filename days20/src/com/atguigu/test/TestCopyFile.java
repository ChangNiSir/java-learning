package com.atguigu.test;

import java.io.*;

public class TestCopyFile {
    public static void main(String[] args) {
        // 处理流复制文件（图片视频）
        try {
            File fileOne = new File("days19\\file\\hello.txt");// "D:\\Edge download\\upgrade的抖音_-_抖音\\upgrade的抖音_.mp4");
            File fileTwo = new File("days19\\file\\hello_副本.txt");
            if(!fileTwo.exists())
                fileTwo.createNewFile();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileOne));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileTwo));
            byte[] datas = new byte[1024];
            while(true){
                int length = bufferedInputStream.read(datas);// 有效数据长度
                if(length == -1)
                    break;
                bufferedOutputStream.write(datas,0,datas.length);
                bufferedOutputStream.flush();
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();


        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
