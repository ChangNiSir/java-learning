package com.atguigu.test2;

public class Student {
    private String stuName;
    private int stuAge;

    public Student(){}
    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getInfo(){
        return "姓名："+stuName+"，年龄："+stuAge;
    }

    // 封装
    public String getStuName(){
        return stuName;
    }

    public void setStuName(String stuName){
         this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        if(stuAge >= 20 && stuAge <= 40){
            this.stuAge = stuAge;
        }else{
            this.stuAge = 20;
        }
    }

    // 继承





}
