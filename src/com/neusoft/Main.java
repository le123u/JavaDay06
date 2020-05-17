package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 14:12
 */
public class Main {
    public static void main(String[] args) {
        //String类 java.lang包下 不需要导包
        String s1 = "abc";
        System.out.println(s1);
        String s2 = "abc";
        System.out.println(s2);
        s1 += "d";
        System.out.println(s1);
        // 上面abc 的创建相当于new string 传入char型数组
        char data[] = {'a','b','c'};
        String str = new String(data);//String 底层是字符数组实现的




//        String abc = new String("abc");
//        System.out.println(abc);


    }
}
