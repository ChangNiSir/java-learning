package com.atguigu.test1;

import java.io.File;

public class TestTwo {
    public static void main(String[] args) {
        File file = new File("D:\\Data");
        if(file.isDirectory()){
            String[] name = file.list();// 返回文件名（有后缀名）和子文件夹名称的String数组
            for (String s : name) {
                System.out.println(s);
            }
            System.out.println("---------------------------------------");
            File[] files = file.listFiles();// 返回文件和子文件夹的对象数组
            for (File f : files) {
                System.out.println(f);
//                if(f.isDirectory()){
//                    File[] files1 = f.listFiles();
//                    for (File f1 : files1) {
//                        if(f1.isDirectory()){
//                            File[] files2 = f1.listFiles();
//                        }
//                    }
//                }
            }
        }else{
            System.out.println("这不是一个文件夹");
        }

        // 递归调用

    }
}
