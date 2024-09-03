package com.atguigu.test1;

import java.util.HashMap;
import java.util.Map;

public class TestOne {
    public static void main(String[] args) {
        // Map接口：键值对集合
        Map map = new HashMap();
        map.put("班长","美国");// 存入键值对
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");

        String s = (String)map.get("班长");// 用键取值---返回Object必须向下转型
        System.out.println(s);

        System.out.println(map);
        // map.remove("班长");// 删除键值对---使用键作为检索条件
        map.remove("班长","美国");// ---使用键+值作为检索条件
        System.out.println(map);

        System.out.println(map.isEmpty());
        // map.clear();// 清空Map集合
        System.out.println(map.containsKey("班长"));// 是否存在某键或者某值
        System.out.println(map.containsValue("中国"));
//        map.replace("学委","以色列");// 使用新值替换某键（值）对应的旧值
        map.replace("学委","俄罗斯","以色列");
        System.out.println(map);
        System.out.println(map.size());
        map.put("文委","希腊");// put可以替代replace(, )---集合中已存在的键，新值替换键对应的原值
        System.out.println(map.size());
        System.out.println(map);
    }
}
