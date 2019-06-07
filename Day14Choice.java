package day14;

/**
 * Author: Sweetie77
 * Created: 2019/6/4
 */
public class Day14Choice {
    public static void main(String[] args) {
        String s1 = "abc"+"def";
        String s2 = new  String(s1);
        if(s1.equals(s2))
            System.out.println("equals");
        if(s1==s2)
            System.out.println("==");
    }
}
