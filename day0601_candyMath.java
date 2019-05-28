package com.tang.day06;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class day0601_candyMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1, y2, y3, y4;
        float a, b, c;
        while (in.hasNext()) {
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();

            a = (y1 + y3) / 2f;
            b = (y3 - y1) / 2f;
            c = (y4 - y2) / 2f;
            if ((a - ((y1 + y3) / 2)) != 0) {
                System.out.println("no");
                return;
            }
            if ((b - (y3 - y1) / 2 != 0) || (b != ((y2 + y4)))) {
                System.out.println("no");
                return;
            }
            if ((c - (y4 - y2) / 2)!=0){
                System.out.println("no");
                return;
            }
            System.out.println((int) a +" "+(int)b+" "+(int)c);
        }
    }
}
