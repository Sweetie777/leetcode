package day21;

import day07.Test;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/6/12
 */
public class getTotalCount {

    public static void main(String[] args) {
        long s1 = 1;
        long s2 = 1;
        int count;
        long temp;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.println("第" + i + "个月的兔子对数：" + s1);
                continue;
            } else if (i == 2) {
                System.out.println("第" + i + "个月的兔子对数：" + s2);
                continue;
            } else {
                temp = s2;
                s2 = s1 + s2;
                s1 = temp;
                System.out.println("第" + i + "个月的兔子对数：" + s2);
            }
        }
    }

//    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            System.out.println("第" + i + "个月的兔子数目为：" + getTotalCount.frubb(i));
//        }
//    }
//
//    public static int frubb(int n) {
//        if (n == 1 || n == 2) return 1;
//        else return frubb(n - 1) + frubb(n - 2);
//    }


}
