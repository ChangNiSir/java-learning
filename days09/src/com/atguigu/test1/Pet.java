package com.atguigu.test1;

// 先静态再普通，先父类再子类(普通在创建对象时调用)
// 静态属性在类加载时分配空间，此时只能调用静态方法
// 先属性，再代码块，最后构造器
public class Pet {

    private String name = methodThree();
    private int age;
    private String gender;
    public static String type = methodFour();

    static{
        System.out.println("in Pet static block one");
    }

    static{
        System.out.println("in Pet static block two");
    }

    {
        System.out.println("in Pet block one");
    }

    {
        System.out.println("in Pet block two");
    }


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

    public void play(){
        // 都要重写写它干啥
        System.out.println("Let's play！");
    }

    public String getInfo(){
        return "宠物名："+name+" 年龄："+age+" 性别："+gender;
    }

    public String methodThree(){
        System.out.println("in Pet methodThree()");
        return null;
    }

    public static String methodFour(){
        System.out.println("in Pet static methodFour()");
        return null;
    }
}
