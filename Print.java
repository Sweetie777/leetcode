package day13;

import sun.java2d.pipe.OutlineTextRenderer;

import static java.lang.System.out;

/**
 * Author: Sweetie77
 * Created: 2019/6/3
 */
public class Print {
    static boolean out(char c){
        out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for(out('A'); out('B')&& (i<2);out('C')){
            i++;
            out('D');
        }
    }
}
