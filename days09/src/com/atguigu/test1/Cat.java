package com.atguigu.test1;

public class Cat extends Pet {
    private String color;


    public Cat() {
    }

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play(){
        super.play();
        System.out.println("去拿小球球");
    }

}
