package day18;

/**
 * Author: Sweetie77
 * Created: 2019/6/8
 */
public class RichManAndPoorMan {
    public static void main(String[] args) {
        int m = 0;
        float largeMoney = 0;
        float smallMoney = 0;
        double money = 0.01;
        for (int i = 1; i <= 30; i++) {
            largeMoney += 3000000.0;
            smallMoney += money;
            money = money * 2;
            System.out.println(largeMoney);
            System.out.println(smallMoney);
        }
    }
}
