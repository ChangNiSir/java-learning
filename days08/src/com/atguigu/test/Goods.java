package com.atguigu.test;

public class Goods {
    public int goodsNo;
    public String goodsName;
    public double goodsPrice;
    public int goodsNum;
    public Type goodsType; // 属性类型是引用数据类型(以类作为类型)

    public Goods(int goodsNo, String goodsName, double goodsPrice, int goodsNum, Type goodsType) {
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsType = goodsType;
    }

    public String getInfo(){
        return "商品编号："+goodsNo+"，商品单价："
                +goodsPrice+"，商品数量："+goodsNum
                +"，商品分类："+goodsType.getInfo();
    }
}


