package day17;

import java.util.Scanner;

/**
 * Author: Sweetie77
 * Created: 2019/6/8
 */
public class Train {
    public static void main(String[] args) {
        // 无重复的全排列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<0||n>10) {
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        getResult(array, 0);
    }
    /* 计算array从start位开始的全排列*/
    private static void getResult(int[] array, int start) {
        if (start == array.length - 1) {
            printArray(array, start);
            return;
        }
        for (int i = start; i < array.length; i++) {
            swap(array, i, start);
            getResult(array, start + 1);
            swap(array, i, start);
        }
    }

    private static void printArray(int[] array, int start) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] array, int from, int to) {
        if (from == to) {
            return;
        }
        int s = array[from];
        array[from] = array[to];
        array[to] = s;
    }
}
