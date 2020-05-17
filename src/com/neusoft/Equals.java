package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/17 15:57
 */
public class Equals {
    private char value[];
    public Equals(char[] value) {
        this.value = value;
    }

        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }// 跟自己进行比较
            if (anObject instanceof Equals) { // 传入的anObject是否属于String类型
                Equals anotherString = (Equals)anObject; //anObject强制转换String类型
                int n = value.length; //s1的长度
                if (n == anotherString.value.length) {
                    char v1[] = value; // 赋值
                    char v2[] = anotherString.value; // 赋值
                    int i = 0;
                    while (n-- != 0) {     // v1和v2中的每一个元素逐一比较
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

}
