package com.atguigu.test1;

import java.io.File;
import java.io.IOException;

public class TestOne {
    public static void main(String[] args) {
        // File类（代表硬盘上的文件或文件夹）---不考虑乱码处理
        // File file = new File("D:\\test");
        // File file = new File("D:\\test","hello.txt");

        // 文件对象及其有关操作（部分有关文件夹）
        // 绝对路径
        // File file = new File("D:\\test\\hello.txt");
        // 相对路径---起点：工程根目录（D:\Program Files\JetBrains\project220309）
        File file = new File("days19\\file\\hello.txt");

        System.out.println(file);// 无法判断是否存在该文件
        System.out.println(file.exists());// 判断是否存在该文件

        System.out.println(file.getName());// 返回没有文件夹路径的文件名
        System.out.println(file.getParent());// 返回文件夹路径
        System.out.println(file.getPath());// 返回带有路径的文件名（考虑文件创建时的方式）

        System.out.println("-------------------------------");
        System.out.println(file.getAbsolutePath());// 返回绝对路径（不考虑文件创建方式）
        System.out.println(file.getAbsoluteFile());// 返回用绝对路径创建的File对象

        // 下述方法同上，但抛异常
        try {
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.getParentFile());// 返回文件所在文件夹的File对象

        try {
            file.createNewFile();// 文件不存在，创建路径下的文件（仅能创建文件）
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.length());// 返回文件所占硬盘大小（单位：B）

        System.out.println(file.canRead());// 判断文件是否可读
        System.out.println(file.canWrite());// 判断文件是否可写
        System.out.println(file.isHidden());// 判断文件是否隐藏

        System.out.println(file.isFile());// 判断是否是文件
        System.out.println(file.isDirectory());// 判断是否是文件夹

        // System.out.println(file.delete());// 删除文件（或者文件夹）---要求文件夹为空时才可删文件夹

        // 创建文件夹--非文件
        // file.mkdir();// 创建硬盘文件夹---只能创建一级文件夹
        // file.mkdir();// 创s建硬盘文件夹---创建多级文件夹
    }
}
