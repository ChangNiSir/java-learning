package com.atguigu.test;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        // Map键值对集合
        Map<String,String> map = new HashMap<>();
        map.put("班长","美国");// 存
        String value = map.get("班长");// 取
        System.out.println(map.size());
        System.out.println(map.containsKey("班长"));// 判断
        System.out.println(map.containsValue("美国"));
        // map.remove("班长");
        // map.remove("班长","美国");
        map.replace("班长","中国");
        map.replace("班长","美国","中国");
        System.out.println(map.isEmpty());
        // map.clear();

        // 返回单元素的集合
        Set<String> keys = map.keySet();// 键集
        for (String key : keys) {
            String val = map.get(key);
            System.out.println(key+"："+val);
        }
        System.out.println("--------------------------------");
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String val = map.get(key);
            System.out.println(key+"："+val);
        }

        // 值集是可以重复的且无序（map是无序导致的（值的顺序跟随键走））---使用Collection
        // 直接取值不符合Map键值对的设计初衷
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }
        Iterator<String> iter1 = values.iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }

        // Map泛型 -> 键值对元素（Map.Entry）也是泛型
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            String key = stringStringEntry.getKey();
            String val = stringStringEntry.getValue();
            System.out.println(key+"："+val);
        }

    }
}
