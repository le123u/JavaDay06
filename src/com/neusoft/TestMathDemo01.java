package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 20:42
 */
public class TestMathDemo01 {
    public static void main(String[] args) {
        //abs() 返回double值的绝对值
        int i = Math.abs(-6);
        System.out.println(i);

        // ceil() 返回大于等于参数的最小整数
        double s = Math.ceil(3.3);
        double s1 = Math.ceil(-3.3);
        System.out.println(s);
        System.out.println(s1);

        //round() 四舍五入
        long round1 = Math.round(5.5);
        System.out.println(round1);
    }
}
