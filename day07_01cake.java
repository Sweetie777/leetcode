package day07;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/28
 */
public class day07_01cake {
    static int cnt = 6;
    static {
        cnt += 9;
    }
    public static void main(String[] args) {
        System.out.println("cnt="+cnt);
    }
    static {
        cnt /= 3;
    };
}
