package string;

/**
 * Author: Sweetie77
 * Created: 2019/8/31
 */

import java.util.*;

/**
 * 金山公司面试题：一个字符串中可能包含a~z中的多个字符，如有重复，
 * 如String data="aavzcadfdsfsdhshgWasdfasdf"，
 * 求出现次数最多的那个字母及次数，如有多个重复的则都求出。
 *
 * 引入TreeSet:通过集合快速找到所有出现过的字符串
 * 引入ArrayList:为了快速排序,再通过StringBuilder生成排序后的字符串
 * 通过String的indexOf()方法和LastIndexOf()方法来计算每个字符串出现的次数的最大值
 * 使用HashMap存储出现最多的字符串和次数
 */
public class SortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        new SortTest().doString(input);
    }

    private void doString(String input) {
        /**
         * 第一步:使用TreeSet快速找到所有出现的字符串
         *      将输入的字符串按照升序排列
         */
        //将string转换为字符数组
        char[] ch = input.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        //TreeSet是一个有序集合,TreeSet中的元素将按照升序排列
        //通过TreeSet的不重复性,快速找到所有出现的字符串
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i <ch.length ; i++) {
            list.add(String.valueOf(ch[i]));
            set.add(String.valueOf(ch[i]));
        }
        System.out.println("set="+set);
        //排序
        Collections.sort(list);
        System.out.println("list="+list);
        //将排好序的字符数组转换为StringBuffer
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        input = sb.toString();
        System.out.println("input="+input);


        /**
         * 第二步: 找出出现相同的字符并记录出现多少次
         */
        //最多出现多少次
        int max = 0;
        //重复出现的字符
        String maxString="";
        //重复出现的字符列表
        ArrayList<String> maxList = new ArrayList<>();
        //用来保存出现做多的字符串和次数
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        //将出现过的字符遍历
        Iterator<String> its = set.iterator();
        while (its.hasNext()){
            String os = its.next();
            //出现在排序后input中的第一次位置
            int begin = input.indexOf(os);
            //出现在排序后input中的最后一次位置
            int end = input.indexOf(os);
            int value = end - begin+1;
            //字符出现的次数
            if(value>=max){
                max = value;
                maxString = os;
                hm.put(maxString,max);
            }
        }
        for(Map.Entry<String,Integer>entry : hm.entrySet()){
            if(entry.getValue() == max){
                System.out.println("重复最多的字母是:"+entry.getKey());
                System.out.println("重复最多的次数是:"+entry.getValue());
            }
        }

    }
}
