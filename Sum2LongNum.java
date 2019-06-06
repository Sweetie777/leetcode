package day13;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum2LongNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            System.out.println(AddLongInteger(s1, s2));
        }
    }

    public static String AddLongInteger(String s1, String s2) {
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger res = b1.add(b2);
        return res + "";
    }
}
