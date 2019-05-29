package day07;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/28
 */
public class day07_02LeastCommonMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //如果是奇数, 就直接相乘
        //如果是偶数, 除以2, 除到是奇数或者是2, 然后让最后的数乘2
        //如果是一个奇数一个偶数,也直接相乘
        //先求最大公约数
        //再求最小公倍数
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = 0;
        int min = 0;
        int maxValue = 0;
        int minValue = 0;

        if (n1 == n2) {
            max = min = n1;
        }
        if (n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }
        //求最大公约数
        for (int i = 2; i < min; i++) {
            if ((max % i == 0) && (min % i == 0)) {
                maxValue = i;
            }
        }
        minValue = min * max / maxValue;
        System.out.println(minValue);
    }
}
