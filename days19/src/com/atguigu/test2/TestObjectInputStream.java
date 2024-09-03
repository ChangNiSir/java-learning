package com.atguigu.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) {
        // 对象流---反序列化
        try {
            File file = new File("days19\\file\\object.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Student stu = (Student) objectInputStream.readObject();
            System.out.println(stu);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
