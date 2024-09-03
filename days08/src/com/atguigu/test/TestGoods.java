package com.atguigu.test;

public class TestGoods {
    public static void main(String[] args) {

        // TestGoods
        Type type = new Type(1,"智能手机",2);
        Goods good = new Goods(1,"华为",
                10,10,type);

        System.out.println(type.getInfo());
        System.out.println(good.getInfo());
        //System.out.println(type);

        // TestGoodsTools
        GoodsTools gt = new GoodsTools();
        gt.showGoods(good);
    }
}
