package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 16:26
 */
public class StringDemo05 {
    public static void main(String[] args) {
        // split(String regax) 根据给定正则表达式 的匹配拆分此字符串
        String s = "aa,bb,cc";
        String[] strArray = s.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
