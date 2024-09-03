package com.atguigu.test1;

import java.util.*;

public class TestTwo {
    public static void main(String[] args) {
        // Map接口的遍历
        Map map = new HashMap();
        map.put("班长","美国");// 存入键值对
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");

        // 遍历键
        Set keys = map.keySet();// 返回键集合
        Iterator iter = keys.iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            String value = (String)map.get(key);
            System.out.println(key+"："+value);
        }
        System.out.println("----------------------");

        // 遍历值
        Collection value = map.values();// 返回值集---value无序（键无序）能重复->Collection
        Iterator iter1 = value.iterator();
        while(iter1.hasNext()){
            String val = (String)iter1.next();// 不符合规范
            System.out.println(val);
        }
        System.out.println("----------------------");

        // 遍历键值对
        Set set1 = map.entrySet();
        Iterator iter2 = set1.iterator();
        while(iter2.hasNext()){
            Map.Entry entry = (Map.Entry)iter2.next();
            System.out.println(entry.getKey()+"= "+entry.getValue());
        }
    }
}
