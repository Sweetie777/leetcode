package com.tang.java;

/**
 * Author: Sweetie77
 * Created: 2019/5/23
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(){} //构造方法一
    public Person(String name,int age){ //构造方法二
        this(name,age,null);
    }
    public Person(String name, int age1, String gender){ //构造方法三
        this.name = name;//因为参数与类中的成员变量名相同, 所以用this.name来表示成员变量
        age = age1; //因为参数与类中的成员变量名不同, 所以可以不使用this
        this.gender = gender;
    }
}
