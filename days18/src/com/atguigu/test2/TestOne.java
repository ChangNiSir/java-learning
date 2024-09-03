package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        MyData myData = new MyData();// 一个容器
        User user = new User("Tom","123456",1);
        Book book = new Book("西游记","吴承恩",18.85);

        // 过于精确---浪费空间（User、Book切换）
        myData.setUser(user);
        User u = myData.getUser();
        System.out.println(u);

        myData.setBook(book);
        Book b = myData.getBook();
        System.out.println(b);
        System.out.println("----------------------------------------------------------");

        // 过于通配---无法找到子类的特点 -> 需要强转
        MyDataOne myDataOne = new MyDataOne();
        myDataOne.setData(user);
        User u1 = (User) myDataOne.getData();
        System.out.println(u1);

        myDataOne.setData(book);
        Book b1 = (Book)myDataOne.getData();
        System.out.println(b1);
        System.out.println("----------------------------------------------------------");


    }
}
