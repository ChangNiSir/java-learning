package com.atguigu.test;

public class TestBook {
    public static void main(String[] args) {
//        Book book = new Book("花千骨","匿名",12.5,"神话故事");
//        System.out.println(book.getInfo());
        Book book = new Book();
        book.setBookName("花千骨");
        System.out.println(book.getBookName());
    }
}
