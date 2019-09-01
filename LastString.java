package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/8/31
 */
public class LastString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubString2(s));

    }

    private static int lengthOfLongestSubString(String s) {
        int[] hash = new int[256];
        int max = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < s.length() && j < s.length()) {
            char ch = s.charAt(j);
            if (hash[ch] == 0) {
                hash[ch] = 1;
                j++;
                max = (j - i) > max ? (j - i) : max;
            } else {
                char c = s.charAt(i);
                hash[c] = 0;
                i++;
            }
            count++;
        }
        return max;
    }


    private static int lengthOfLongestSubString2(String s) {
        //write your code here
        if (s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        List<Character> list = new ArrayList<Character>();
        list.add(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                int index = list.indexOf(s.charAt(i));
                list = list.subList(index + 1, list.size());
                list.add(s.charAt(i));
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.add(s.charAt(i));
                maxLength = Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }


    /**
     * 求长度为n的字符串中最长回文子串 n很大
     */
    

}
