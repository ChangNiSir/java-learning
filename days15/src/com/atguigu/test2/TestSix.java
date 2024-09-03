package com.atguigu.test2;

public class TestSix {
    public static void main(String[] args) {
        // StringBuilder和stringBuffer拼字符串
        String word = "Hello";
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.append(" World").append("\n").append("One");
        stringBuilder.append(" ").append("World").append(" ");
        stringBuilder.append("One").append(" ").append("Dream");
        word = stringBuilder.toString();
        System.out.println(word);

    }
}
