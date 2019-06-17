package day19;


import java.util.*;

/**
 * 数据可能有不存在超过红包一半的，这个时候就要输出0；
 * 即该金额的数目必须 大于 红包数一半，不能小于等于。
 * 如果一个数出现次数超过一半了，排序过后，必然排在中间，
 * 则最后遍历整个数组查看是否符合即可
 */
public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i=0;i<gifts.length;i++){
            if(gifts[i] == ans){
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }
}