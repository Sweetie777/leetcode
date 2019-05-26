package com.tang.day05;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
class  HelloA{
    public HelloA(){
        System.out.println("A class");
    }
    static{
        System.out.println("A");
    }
}
public class HelloB extends  HelloA{
    public HelloB(){
        System.out.println("B class");
    }
    static {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new HelloB();
    }

}
