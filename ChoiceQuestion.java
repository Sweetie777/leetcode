package day11;

import java.util.HashMap;

/**
 * Author: Sweetie77
 * Created: 2019/5/31
 */
public class ChoiceQuestion {
    String str = new String("good");
    char[] ch  = {'a','b','c'};
    public static void main(String[] args) {
        ChoiceQuestion c = new ChoiceQuestion();
        c.change(c.str,c.ch);
        System.out.println(c.str+" and ");
        System.out.println(c.ch);
//        HashMap map= new HashMap();
//        map.put("name",null);
//        map.put("name","jack");
//        System.out.println(map.size());
//        Thread t= new Thread(){
//            @Override
//            public void run() {
//                pong();
//            }
//        };
//        t.run();
//        System.out.println("ping");
//    }
//    static void pong(){
//        System.out.println("pong");

    }

    private static void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }
}
