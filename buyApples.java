package com.tang.java;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/25
 */
public class buyApples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }

    private static int count(int n) {
        //一定是偶数, 最小是6, 10以上的偶数都可以
        if (n % 2 != n || n == 10 || n < 6) return -1;
        //如果拿八个拿完最好
        if (n % 8 == 0) return n / 8;
        //对于10以上的偶数,只要堆8取余不为i, 就要从前面的1或2个8中拿出2个, 把余数补为6
        //本来余数就是6, 就不用拿 , 所以+1
        return 1+ n/8;
    }

}
