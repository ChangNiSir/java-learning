package com.atguigu.test4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// jdk1.8之前的日期处理
public class TestFour {
    public static void main(String[] args) {
        // Date类
        Date date = new Date();
        // System.out.println(date);// Thu Aug 01 18:03:14 CST 2024
        // System.out.println(date.getTime());// 1722506594966

        // 格式化Date对象
        // SimpleDateFormat类处理Date类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(date);
        System.out.println(strDate);

        // Calendar（JDK 1.1）---抽象类不让创建对象
        System.out.println("------------------------------");
        // Calendar子类对象（调用方法）
        Calendar cal = Calendar.getInstance();
        System.out.println("cal:"+cal);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        // 时间位移
        // cal.add(Calendar.YEAR, 10);// year+10
        cal.add(Calendar.HOUR_OF_DAY, -1000);//-1000小时后（24时）

        // Calendar ---> Date ---SimpleDateFormat---> String
        Date date1 = cal.getTime();
        String strDate1 = sdf.format(date1);
        System.out.println(strDate1);

    }
}
