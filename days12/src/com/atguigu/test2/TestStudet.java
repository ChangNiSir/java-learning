package com.atguigu.test2;

import java.io.IOException;
import java.sql.SQLException;

public class TestStudet {
    public static void main(String[] args)  {
        Student stu = new Student();
        //stu.setStuAge(100);
        try {
            stu.setStuAge(100);  // 异常抛到这
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(stu.getStuAge()); // 不能把异常抛给虚拟机
    }
}
