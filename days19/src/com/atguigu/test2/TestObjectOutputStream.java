package com.atguigu.test2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 字符处理流---需要创建字符节点流
public class TestObjectOutputStream {
    public static void main(String[] args) {
        // 对象流---序列化
        try {
            File file = new File("days19\\file\\object.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);// 字节节点流
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);// 字节处理流
            objectOutputStream.writeObject(new Student("Tom",20));
            objectOutputStream.flush();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
