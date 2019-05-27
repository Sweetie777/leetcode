package com.tang.day05;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a +"."+b);
        System.out.println("============");

}

    static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
