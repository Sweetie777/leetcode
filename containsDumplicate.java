package com.tang.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sweetie77
 * Created: 2019/5/16
 */
public class containsDumplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =  0; i < nums.length; i++){
                if(map.containsKey(nums[i])){
                    return true;
                }
                map.put(nums[i],i);
            }
            return false;
        }
    }
}