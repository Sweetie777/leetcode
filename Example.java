package com.tang.day05;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class Example {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + "and");
        System.out.print(ex.ch);
        System.out.println("=======");
        boolean b = true ? false : true == true ? false:true;
        System.out.println(b);

    }
    public void change(String str, char ch[]){
        //引用类型变量, 传递的是地址, 属于引用传递
        str = "test ok";
        ch[0] = 'g';

    }
}
