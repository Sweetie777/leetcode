package day13;

/**
 * Author: Sweetie77
 * Created: 2019/6/3
 */
public class Day13Choice {
    public static void main(String[] args) {

        int x = 20;
        int y = 30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }
}
