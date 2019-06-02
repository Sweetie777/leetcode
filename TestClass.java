package day09;

import day07.Test;

/**
 * Author: Sweetie77
 * Created: 2019/5/29
 */
public class TestClass {
    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.change(t.str,t.ch);
        System.out.print(t.str +" and ");
        System.out.print(t.ch);
        System.out.println("========");
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

    private void change(String str,char ch[]) {
    str = "test ok";
    ch[0] = 'c';
    }
}
