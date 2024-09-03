package com.atguigu.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestOne {
    public static void main(String[] args) {
        // JDK 1.8之前的日期处理
        // 1
        Date date = new Date();// getTime()---毫秒数
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(date);
        System.out.println(strDate);

        // 2
        Calendar cal = Calendar.getInstance();// 面向接口编程
        System.out.println(cal);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        cal.add(Calendar.YEAR, -100);// year + 100
        Date date1 = cal.getTime();// Calendar -> Date
        String strDate1 = sdf.format(date1);
        System.out.println(strDate1);

    }


}
