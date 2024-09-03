package com.atguigu.test;

// JavaBean类 属性私有+无参构造器
public class Book {
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private String bookContent;

    // 对象初始化

    // 对象创建完成后无法调用构造器
    public Book() {
    }

    public Book(String bookName, String bookAuthor, double bookPrice, String bookContent) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookContent = bookContent;
    }

    // 修改值
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public String getInfo(){
        return "书名："+bookName+"，作者："+bookAuthor+"，单价："+bookPrice+"，简介："+bookContent;
    }

}
