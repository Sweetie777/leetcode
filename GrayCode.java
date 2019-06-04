//package day12;
//
///**
// * Author: Sweetie77
// * Created: 2019/6/3
// */
//
////给定一个整数n, 返回n位的格雷码, 顺序从0开始
//
///**
// * 递归生成码表
// * 这种方法是基于格雷码是反射码的事实, 利用递归的如下规则来构造:
// * 1.1位格雷码有两个码字
// * 2.(n+1)位格雷码中的前2n个码字等于n位格雷码的码字, 按顺序书写, 加前缀0
// * 3.(n+1)位格雷码中的后2n个码字等于n位格雷码的码字, 按逆序书写, 加前缀1
// * 4.(n+1)位格雷码的集合=n位格雷码的jihe(顺序)加qianzhui0+n位格雷码jihe(逆序), 加前缀1
// */
//public class GrayCode {
//    public String[] getGray(int n){
//        if(n==1){
//            return new String[]{"0","1"};
//        }else{
//            String[] temp = getGray(n-1);
//            String[] result = new String[temp.length*2];
//            for(int i = 0;i<temp.length;i++){
//                return[i] = "0"+temp[i];
//                int i,j;
//                for(i = 0,j = temp.length-1;i<temp.length&& j>=0;i++,j--)
//                    return [i+temp.length ]= "1"+temp[j];
//                return result;
//            }
//        }
//    }
//
//}
