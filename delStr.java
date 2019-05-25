package com.tang.java;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/25
 */
public class delStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i = 0; i  < ch.length;i++){
                if(! str.contains(String.valueOf(ch[i])));
            }
        }

    }
}
