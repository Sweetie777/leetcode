package day08;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/5/28
 */
public class Joseph {
    public static void main(String[] args) {
        //约瑟夫环问题
        /**
         * 约瑟夫环的问题；
         * f(1)=0;
         * f(i)=(f(i-1)+m)%i
         * f(i)表示i个人玩游戏最后胜利者的编号，这里人员编号从0到i-1,报数从是从0到m-1
         */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0)
                System.out.println(-1);
            int a[] = new int[n + 1];
            a[1] = 0;
            for (int i = 2; i < a.length; i++) {
                a[i] = (a[i - 1] + 3) % i;
            }
            System.out.println(a[n]);
        }
    }
}
