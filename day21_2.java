package day21;

/**
 * Author: Sweetie77
 * Created: 2019/6/12
 */
public class day21_2 {
    public static void main(String[] args) {
        char s = 0,c;
        while(s!= 0){
            if(s - 'A' >= 0){
                s = (char) (s >'E'?s - 5: s + 21);
                System.out.println(s);
            }
        }
    }
}
