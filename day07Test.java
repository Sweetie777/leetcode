package day07;

/**
 * Author: Sweetie77
 * Created: 2019/5/28
 */
public class day07Test {
    private static int x=  100;
    public static void main(String[] args) {
        day07Test d1 = new day07Test();
        d1.x++;
        day07Test d2= new day07Test();
        d2.x++;
        d1 = new day07Test();
        d1.x++;
        day07Test.x--;
        System.out.println("x="+x);
    }
}
