package com.tang.java;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sweetie77
 * Created: 2019/5/13
 */
public class Sum2Numbers {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j]== target-nums[i]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 用Hash表优化速度
     * @param nums
     * @param target
     * @return
     */
    public int[] TwoSum2 (int[]nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = {0,0};
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if(map.containsKey(j) &&  i !=map.get(j)){
                result[0] = map.get(j);
                result[1] = i;
            }
        }
        return result;
    }

    /**
     * 将hash表和判断放入同一个循环
     * 时间复杂度 O(n), 空间复杂度 O(n)
     * @param nums
     * @param target
     * @return
     */
    public  int[] TwoSum3(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = {0,0};
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if(map.containsKey(j) && i !=map.get(j)){
                result[0] = map.get(j);
                result[1] = i;
            }
            map.put(nums[i],i);
        }
        return result;
    }


    public static void main(String[] args) {
        Sum2Numbers s= new Sum2Numbers();
        int[] nums = {2,7,11,15};
        int target = 9;
        s.twoSum(nums,target);
    }
}
