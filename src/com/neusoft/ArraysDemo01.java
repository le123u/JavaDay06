package com.neusoft;

import java.util.Arrays;

/**
 * @author Liu
 * @date 2020/5/17 20:03
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        // toString() 返回此对象本身
        // 返回对象的字符串表达形式
        int[] arr = {6,3,4,2,8,9,5};
        System.out.println(arr);
        System.out.println("排序前"+ Arrays.toString(arr));

        // static void sort(int[] a ) 对指定的int型数组按数字升序排序
        Arrays.sort(arr);
        System.out.println("排序后"+ Arrays.toString(arr));

        //字符升序排序 并且倒序打印
        String line = "DASmdsaopMINRT";
        char[] s = line.toCharArray();
        System.out.println("排序前"+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("排序后"+ Arrays.toString(s));
        //反向遍历输出
//        for (int i =  s.length - 1; i >= 0; i--) {
//            System.out.println(s[i]+" ");
//        }
        for(int min = 0,max = s.length-1;min <= max ;min++ ,max--){
            int temp = s[min];
            s[min] = s[max];
            s[max] = (char) temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+"\t");
        }

        // copyOf()复制指定数组，截取或用false填充，以使副本具有指定长度
        // 完全拷贝 返回新的数组
        int[] ints = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints1));


    }
}
