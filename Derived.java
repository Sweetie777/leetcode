package com.tang.java;

/**
 * Author: Sweetie77
 * Created: 2019/5/23
 */
class Base{
    public Base(String s){
        System.out.println("B");
    }
}
public class Derived extends Base {
    public Derived(String s){
        super("hello");
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Derived("C");
    }
}
