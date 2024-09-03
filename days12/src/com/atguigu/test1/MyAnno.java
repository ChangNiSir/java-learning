package com.atguigu.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD}) // 注解的使用范围
@Retention(RetentionPolicy.SOURCE) // 注解的生命周期
public @interface MyAnno {
    // default 声明默认值
    public String[] value() default {"hello","hi"}; // 属性
    public String name();
}
