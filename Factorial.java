package day09;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/29
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        for(i = 1; i <= n; i++){
            n = n*i;
        }
    }
}
