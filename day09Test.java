package day09;

/**
 * Author: Sweetie77
 * Created: 2019/5/29
 */
public class day09Test {
    public static void main(String[] args) {

        String x = "fmn"; //fmn在常量池里, 是不可变对象
        x.toUpperCase();//?这句话可有可无
        String y = x.replace('f', 'F');
        y = y + "wxy";
        System.out.println(y);
    }
}
