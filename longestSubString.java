package com.tang.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sweetie77
 * Created: 2019/5/15
 */
public class longestSubString {

    //思路分析 :
    //这个题的难点在于怎么确定无重复字符的最长子串. 因为可以存在这样的情况, 子串之间就可能会有交集
    //所以当我们从这个字符串的第一个字符开始遍历时, 发现第一个重复的字符时,
    //我们就需要记录当前的长度与之前的最大长度比较, 取最大的作为目前子串的最大长度
    //然后需要去寻找之前与这个字符相同的元素的索引位置
    //从这个位置的后一个位置的元素重新开始统计

    public int lengthOfLongestSubstring(String s) {
        //若字符串为空或者长度为0
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] ch = s.toCharArray();//将字符串转化为字符数组
        List<Character> list = new ArrayList<Character>();//定义容器ArrayList
        list.add(ch[0]);//将第一个元素添加到容器中
        int max = 1;//初始化最长子串的长度为1
        for (int i = 1; i < ch.length; i++) { //从字符串的第二个字符开始
            if (!list.contains(ch[i])) { //若容器中不包含这个元素, 则添加到容器中
                list.add(ch[i]);
            } else { //若容器包含这个元素
                if (list.size() > max) { // 若此时容器的大小大于max, 则将它的长度赋值给max
                    max = list.size();
                }
                int back = i - 1;//从这个元素的前一个元素开始, 向前去找与它相同的那个元素
                while (back >= 0) {
                    if (ch[back] != ch[i]) {
                        back--;
                    } else {
                        break;
                    }
                }
                list.clear();//清空容器
                list.add(ch[back + 1]);//将寻找到的那个元素的后一个元素加入容器
                i = back + 1;//加上循环的i++, i = back + 2, 即从寻找到的那个元素的后两个元素开始重新统计
            }
        }
        if (list.size() > max) { // 当上面循环完成, 再次比较容器的大小与max
            max = list.size();
        }
        return max;
    }

    /**
     * 遍历字符串, 每次用 i 值记录, 不回溯 i
     * 用flag记录遍历过程找到的重复的字符的位置
     * 如果遇到重复的字符, i - flag 就是子串长度, 此时flag重新定位到子串中重复字符的位置, i 继续往后遍历
     * length 和 result 记录长度
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while(i < s.length()){
            int pos = s.indexOf(s.charAt(i),flag);
            if(pos < i){
                if(length > result){
                    result = length;
                }
                if(result >= s.length() -pos-1){
                    return result;
                }
                length = i - pos -1;
                flag = pos +1;
            }
            length++;
            i++;
        }
        return length;
    }
}
