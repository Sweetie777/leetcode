package com.tang.java;

/**
 * Author: Sweetie77
 * Created: 2019/5/22
 */
public class finder {
    public int findkth(int[] a, int n, int k){
        return findkth(a,0,n-1,k);
    }
    public int findkth(int[]a,int low,int high,int k){
        int part = partation(a,low,high);
        if(k == part - low +1) return a[part];
        else if(k > part - low +1) return findkth(a,part+1,high,k-part+low-1);
        else return findkth(a,low,part-1,k);
    }

    private int partation(int[] a, int low, int high) {
        int key = a[low];
        while (low < high){
            while (low < high && a[high] <= key) high--;
            a[low] = a[high];
            while(low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

}
