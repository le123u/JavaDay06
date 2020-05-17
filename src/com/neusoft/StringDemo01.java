package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 14:35
 */
public class StringDemo01 {

    public static void main(String[] args) {
        // String的equal方法
        // 创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        //equal(Object anObject)将此字符串与指定的对象比较
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        boolean b = s1.equals(s3);
        System.out.println(b);

        //equalsIgnoreCase()忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));



        //扩展 大厂面试题（重点中的重点）
        // 1.基本数据类型的比较 用==
        // 2.引用数据类型的比较 是地址值 和里面的真实的值
        //String的equal是如何实现的


    }
}
