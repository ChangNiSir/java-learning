package com.atguigu.test1;


public class Dog extends Pet {
    private String color = methodOne();
    public static String info = methodTwo();

    // 静态代码块
    // 类的加载时静态属性分配了内存空间，需立即赋值
    // 而静态代码块只在类加载时调用，与普通代码块不同（创建对象时调用）

    static {
        System.out.println("in Dog static block one");
        info = "这是一只狗-------------------";
    }

    static {
        System.out.println("in Dog static block two");
    }


    // -------------普通代码块------------
    // 创建对象时
    // 按定义顺序依次调用(早于构造器)
    {
        System.out.println("in Dog block One");
    }

    {
        System.out.println("in Dog block Two");
    }


    //    public Dog() {
    // 继承状态下，子类构造器必须在第一行调用父类构造器
    // 子类构造器默认调用父类无参构造器
//          super("小狗狗",3,"公");  // 创建父类对象使用父类属性
//    }

    // 三个 构造器
    public Dog() {
        super();
        System.out.println("in Dog()");
    }

    public Dog(String color) {
//        super();
        this.color = color;
    }

    public Dog(String name,String info) {
        //super(name); 没有这样的父类构造器
        this.setName(name);
        Dog.info = info;

    }

    public Dog(String name, int age, String gender, String color) {
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
    public void play() {
        super.play();
        System.out.println("去拿项圈");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" 颜色："+color;
    }

    public String methodOne(){
        System.out.println("in Dog methodOne()");
        return "";
    }
    public static String methodTwo(){
        System.out.println("in Dog methodTwo()");
        return "";
    }
}
