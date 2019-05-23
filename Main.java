package com.tang.java;

import java.util.*;

/**
 * day02 - 1
 */
public class Main{
    public static int drink(int n){
        int total = 0;//饮料总数
        //当大于两个空瓶时才可以兑换饮料
        while(n >2){
            total = total+n/3;
            n=n/3 + n%3;
        }
        if(n ==2){
            total = total + 1;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        while(s.hasNext()){
            n = s.nextInt();
            System.out.println(drink(n));
        }
    }

}