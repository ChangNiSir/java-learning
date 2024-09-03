package com.atguigu.test1;

import org.junit.*;

public class TestOne {

    // 静态非普通
    @BeforeClass
    public static void staticBefore(){
        System.out.println("in static staticBefore()");
    }

    @AfterClass
    public static void staticAfter(){
        System.out.println("in static staticAfter()");
    }

    // 普通非静态方法
    @Before
    public void before(){
        System.out.println("in before()");
    }

    @After
    public void after(){
        System.out.println("in after()");
    }


    // Test注解
    @Test
    public void test(){
        System.out.println("in test()");
    }

    @Test
    public void test1(){
        System.out.println("in test1()");
    }
}
