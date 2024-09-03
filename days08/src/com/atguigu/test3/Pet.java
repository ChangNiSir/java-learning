package com.atguigu.test3;

// 隐示继承自Object（无显示继承时）
// 亚当夏娃----Object(方法类)
public class Pet {
    private String name;
    private int age;
    private String type;

    public Pet() {
    }

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo(){
        return "名字："+name+"，年龄："+age+"，品种："+type;
    }

    public Pet play(){
        System.out.println("和你玩");
        return null;
    }
}
