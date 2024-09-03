package com.atguigu.test;

public class GoodsTools {
    public void showGoods(Goods good){
//        System.out.println("商品编号："+good.goodsNo+"，商品单价："
//                +good.goodsPrice+"，商品数量："+good.goodsNum
//                +"，商品分类："+good.goodsType.getInfo());
        System.out.println(good.getInfo());
    }
}
