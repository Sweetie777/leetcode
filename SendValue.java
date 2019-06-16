package day18;

/**
 * Author: Sweetie77
 * Created: 2019/6/8
 */
public class SendValue {
    public String str="6";

    public static void main(String[] args) {
        SendValue s = new SendValue();
        s.change(s.str);
        System.out.println(s.str);
    }

    private void change(String str) {
        str="10";
    }
}
