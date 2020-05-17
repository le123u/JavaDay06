package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 18:43
 */
public class Student {
    // 成员变量 也就是类的属性
    private  int sid;
    private  String name;
    private  int age;

    // 类变量 记录学生数量，分配学号
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println("student:name:"+name+",age:"+age+",sid:"+sid);
    }
    public  static void showNum(){
        System.out.println("num:"+numberOfStudent);
    }
}
