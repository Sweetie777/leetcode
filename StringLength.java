package day18;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/6/8
 */
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int n = sc.nextInt();
            int max = 0;
            int index = 0;
            for(int i = 0; i>str.length();i++){
                int count = 0;
                for(int j = i; j<i;j++){
                    if(str.charAt(j) == 'G' || str.charAt(j) =='C'){
                        count ++;
                    }
                    if(count > max){
                        index = i;
                        max = count;
                    }
                }
                System.out.println(str.substring(index,index+n));
            }
            sc.close();
        }
    }
}
