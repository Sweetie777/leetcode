package day12;

/**
 * Author: Sweetie77
 * Created: 2019/6/3
 */

/**
 * DAY12-01
 * 编写一个函数, 不使用临时变量, 直接交换两个数的值
 * @param 第0个元素和第1个元素
 */
public class Exchange {

    public int[] exchangeAB(int[] AB) {
        // write code here
        if(AB.length==0){
            return AB;
        }
        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];

        return AB;
    }
}