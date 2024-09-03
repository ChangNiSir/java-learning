package com.atguigu.test;

public class Type {
    public int typeNo;
    public String typeName;
    public  int typeLevel; //密码 等级

    public Type(int typeNo, String typeName, int typeLevel) {
        this.typeNo = typeNo;
        this.typeName = typeName;
        this.typeLevel = typeLevel;
    }

    public String getInfo(){
        //System.out.println("分类编号："+typeNo+",分类名称："
        //        +typeName+",分类等级："+typeLevel);
        String s = "分类编号："+typeNo+",分类名称："
                +typeName+",分类等级："+typeLevel;
        return s;
    }
}
