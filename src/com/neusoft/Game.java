package com.neusoft;

import java.util.ArrayList;

/**
 * @author Liu
 * @date 2020/5/17 19:17
 */
//  静态代码块 常用于给类变量进行初始化赋值
public class Game {
    public static int number;
    public  static ArrayList<String> list;
    // 静态代码块
    static{
        number = 2;
        list.add("张三");
        list.add("李四");
        System.out.println("静态代码块执行");

    }
    // 静态代码块随着类的加载 而执行一次， 优先于main方法和构造方法执行

    public Game(){
        System.out.println("构造函数执行");
    }
}
