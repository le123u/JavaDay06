package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/17 16:33
 */
public class StringDemo07 {
    public static void main(String[] args) {
        // 键盘录入一个字符串 ， 统计字符串中大小写字母及数字字符的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.nextLine();

        int Big = 0;//大写的个数
        int Small = 0;//小写的个数
        int Num = 0;//数字的个数
        int Other = 0; //其他

        // 将字符串转化成字符数组
        char[] str = s.toCharArray();
        // 遍历字符数组

        for (int i = 0; i < str.length; i++) {
            if(str[i] >= 'a' && str[i] <= 'z' ){
                Big++;
            }else if(str[i] >= 'A' && str[i] <= 'Z'){
                Small++;
            }else if(str[i] >= '0' && str[i] <= '9') {
                Num++;
            }else{
                Other++;
            }
        }
        System.out.println("大写字母个数:"+Big+",小写字母个数:"+Small+",数字个数:"+Num+",其他字符个数:"+Other);

    }
}
