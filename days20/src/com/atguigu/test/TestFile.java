package com.atguigu.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        // File类的方法
        File file = new File("");
        System.out.println(file.getName());// 返回没有路径的文件名
        System.out.println(file.getParent());// 返回文件所在的路径
        File parent = file.getParentFile();// 返回文件所在文件夹的File对象
        System.out.println(file.getPath());// 返回路径和文件名（考虑文件创建方式）
        System.out.println(file.getAbsolutePath());// 返回文件绝对路径
        File absoluteFile = file.getAbsoluteFile();// 返回文件绝对路径的File对象
        try {
            System.out.println(file.getCanonicalPath());// 返回文件绝对路径---抛异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File canonicalFile = file.getCanonicalFile();// 返回文件绝对路径的File对象---抛异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 判断方法
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        // 建立方法
        try {
            file.createNewFile();// 创建文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.mkdir();// 创建最后一级的文件夹
        file.mkdirs();
        file.delete();// 删除文件或者文件夹（要求为空）
        // 文件夹操作方法
        String[] files = file.list();// 返回子文件及子文件夹String
        File[] files1 = file.listFiles();// // 返回子文件及子文件夹的File对象


    }
}
