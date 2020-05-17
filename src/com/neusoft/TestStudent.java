package com.neusoft;

import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/5/17 18:51
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 16);
        Student s3 = new Student("wangwu", 17);
        Student s4 = new Student("zhaoliu", 19);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        Student.showNum();


    }
}
