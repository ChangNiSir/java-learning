package com.atguigu.test;

public class Pet {
    private String name;
    private int age;
    private String gender;

    public Pet() {
    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfo(){
        return "宠物名："+name+" 年龄："+age+" 性别："+gender;
    }

    public void play(){
        // 都要重写写它干啥
        System.out.println("Let's play！");
    }
}
