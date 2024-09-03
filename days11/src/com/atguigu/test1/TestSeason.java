package com.atguigu.test1;


public class TestSeason {
    public static void main(String[] args) {

        SeasonEnum seasonEnum = SeasonEnum.SPRING;
        System.out.println(seasonEnum); //Enum类替自定义枚举类重写了toString
        System.out.println(seasonEnum.name());
        System.out.println(seasonEnum.ordinal());
        System.out.println("--------------------------------------");
        // 返回枚举类中所有枚举值的数组
        SeasonEnum[] seasonEnums = seasonEnum.values();
        for(int i = 0;i < seasonEnums.length; i++){
            System.out.println(seasonEnums[i]);
        }

        System.out.println("--------------------------------------");
        // 根据属性名返回枚举对象
        SeasonEnum seasonEnum1 = SeasonEnum.valueOf("SPRING");
        System.out.println(seasonEnum1);


    }


}
