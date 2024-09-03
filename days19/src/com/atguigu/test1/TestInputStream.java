package com.atguigu.test1;

import java.io.File;
import java.io.FileInputStream;

public class TestInputStream {
    public static void main(String[] args) {
        // 字节输入流（节点流）---程序作为参照
        try{
            File file = new File("days19//file//hello.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] datas = new byte[(int)(file.length())];// .length()返回文件所占字节大小
            fis.read(datas);// 一次读一个字节数组的内容
            String word = new String(datas);// String创建对象时可以实现byte[] -> String
            System.out.println(word);
//            while(true){
//                int code = fis.read();// 一次读取一个字节（返回字节编码，-1代表读取失败）
//                if(code == -1)
//                    break;
//                char c = (char)code;
//                System.out.print(c);
//            }
            // fis.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
