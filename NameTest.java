package day17;

/**
 * Author: Sweetie77
 * Created: 2019/6/8
 */
public class NameTest {
    public String name="abc";

    public static void main(String[] args) {
        NameTest n = new NameTest();
        NameTest nb = new NameTest();
        System.out.println(n.equals(nb)+","+n.name.equals(nb));


    }
}
