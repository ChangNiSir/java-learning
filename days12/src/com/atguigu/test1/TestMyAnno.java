package com.atguigu.test1;

@MyAnno(value = {"hello","hi"},name = "白子画")
public class TestMyAnno {
    @MyAnno(name = "hello")
    private int one;

//    @MyAnno
    public TestMyAnno() {
    }

    @MyAnno(value = "hello",name = "花千骨")
    public void methodOne(){

    }
}
