package com.tang.day05;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class java0501_pocket {
    static int[] weight;
    static int N;
    static  int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            N = input.nextInt();
            weight = new int[ N +1];
            for(int i = 1; i < N; i++){
                weight[i] = input.nextInt();
            }
            count(40,N);
            System.out.println(count);
        }
    }

    private static void count(int s, int n) {
        //如果正好装满
        if(s == 0){
            ++count;
            return;
        }
        //如果是s<0 或者 n<1 则不能完成
        if(s <0 || (s>0 && s<1)) return;
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}
