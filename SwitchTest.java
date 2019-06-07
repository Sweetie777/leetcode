package day14;

/**
 * Author: Sweetie77
 * Created: 2019/6/4
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("value="+switchit(4));
    }

    private static int switchit(int i) {
        int j = 1;
        switch (i){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return i+j;
    }
}
