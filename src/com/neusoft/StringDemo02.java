package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 14:35
 */
public class StringDemo02 {

    public static void main(String[] args) {

        // int length() 返回此字符串的长度 实际调用的是底层length数组的属性
        // 阅读源码，源码的书写都是很严谨 ，标准的  去学习
        // 好公司面试经常会问
        String s = "helloworld";
        System.out.println(s.length());
        System.out.println("-------------------");

        //concat(String str) 将指定字符串拼接到此字符串的结尾
        String s1 = s.concat("**hello");
        System.out.println(s1);

        // charAt(int index) 返回指定索引处的char值
        char c = s.charAt(0);
        System.out.println(c);

        // indexOf(String str)  返回指定子字符串在此字符串中第一次出现处的索引
        // 没有返回 -1
        System.out.println(s.indexOf("l"));

        //substring(int beginIndex, int endIndex)  beginIndex是开始位置 左闭右开
        // 返回一个新字符串 它是此字符串的一个子字符串
        String  s2 = s.substring(0);
        String s3 = s.substring(5);// 从第五个开始截取
        System.out.println(s.substring(0,s.length())); //[)
        System.out.println(s2.equals(s));
        System.out.println(s2 == s);




    }
}
