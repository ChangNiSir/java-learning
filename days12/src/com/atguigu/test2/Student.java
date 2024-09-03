package com.atguigu.test2;

import java.io.IOException;
import java.sql.SQLException;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    // 异常区
    // 使用throws
    // throws声明方法向上抛出何种异常（catch捕获），编译器不强制处理异常，调用点必须处理异常
    // 多个异常逗号分割
    //public void setStuAge(int stuAge) throws SQLException,ClassNotFoundException, IOException {
    public void setStuAge(int stuAge) throws StudentAgeException {
        if(stuAge >= 20 && stuAge <= 40) {
            this.stuAge = stuAge;
        }else {
            //this.stuAge = 20; // 起不到提示要求
            //throw可以抛出手动创建的异常对象
            //throw new RuntimeException("学员年龄必须20-40"); //虚拟机终止进程
            //throw new Exception("学员年龄必须20-40");
            //throw new StudentAgeException("学员年龄必须20-40");
            throw new StudentAgeException();
        }
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }


}
