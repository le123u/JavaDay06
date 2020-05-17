package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 20:42
 */
public class TestMathDemo02 {
    public static void main(String[] args) {
     // 计算-10.8到5.9之间  绝对值大于等于6 或者小于2.1的整数有多少个
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (double i = Math.ceil(min); i <= max ; i++) {
            if(Math.abs(i) >= 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}
