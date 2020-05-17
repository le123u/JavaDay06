package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 16:17
 */
public class StringDemo04 {
    public static void main(String[] args) {
        // 转化功能的方法
        // toCharArray() 将此字符串转化成一个新的字符数组
        String s = "abcde";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // getBytes() 适用平台的默认字符集将此String编码为byte序列，并将结果存储到一个新的bytes中
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

        }

        //replace(CharSequence target,CharSequence replacement)
        // 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串
        String str = "itwangzhe itqingtong ";
        String replace = str.replace("it", "IT");
        str = replace;
        System.out.println(str);

    }
}
