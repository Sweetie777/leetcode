package day15;

/**
 * Author: Sweetie77
 * Created: 2019/6/6
 */

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int result;
        int sum=A^B;
        int carry =(A&B)<<1;
        if(carry == 0)
            result = sum;
        else
            result = addAB(sum,carry);
        return result;
    }
}