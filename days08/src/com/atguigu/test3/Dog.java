package com.atguigu.test3;

// Dog类（子类）继承自Pet类（父类）
// 只有一个直接父类，不支持多重继承
// 支持多层次继承（可以有间接父类---遗传性）
// 构造器不能继承
public class Dog extends Pet {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void work(){
        // name = "Tom";
        // (error)---private(保护)
        // setName();
        // (right)
        System.out.println("导盲启动");
    }

    // 为了体现子类特征 -> 子类方法重写 ( 方法签名相同 )
    // 发生在父子类中
    // 访问修饰符不能比父类窄
    // private 不能重写
    // void、基础数据类型返回必须一致
    // 父类返回类型是引用数据类型，子类重写父类方法可以返回父类方法返回类型的子类型

    public Dog play(){
        // super代替父类对象
        // this代替本类对象
        super.play();
        System.out.println("玩丢飞盘");
        return null;
    }
}
