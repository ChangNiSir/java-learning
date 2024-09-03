package com.atguigu.test2;

import java.util.Objects;

public class Student {
    private String stuName;
    private int stuAge;
    private  String stuGender;

    // 常量 不允许修改
    // 属性有默认初始值，final要求赋初始值
    public final  String school = "清华";


    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
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

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

//    @Override
//    public String toString() {
//        return "姓名："+stuName;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStuAge() == student.getStuAge() &&
                getStuName().equals(student.getStuName()) &&
                getStuGender().equals(student.getStuGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuName(), getStuAge(), getStuGender());
    }
}
