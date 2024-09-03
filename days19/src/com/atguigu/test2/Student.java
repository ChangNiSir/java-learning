package com.atguigu.test2;

import java.io.Serializable;

// 对象流操作对象，类需要实现Serializable（（反）序列化）接口
public class Student implements Serializable {
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
