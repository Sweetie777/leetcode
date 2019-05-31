package day08;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Sweetie77
 * Created: 2019/5/28
 */
public class TopK {


    private static int[] getRandomInts(int count, int max) {

        if (count <= 0 || max <= 0) {
            return null;
        }

        Random random = new Random();

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = random.nextInt(max);
        }

        return result;
    }


    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = left;
        int index = pivot + 1;

        for (int i = index; i <= right; i++) {
            if (a[pivot] > a[i]) {
                swap(a, i, index);
                index++;
            }
        }

        swap(a, index - 1, pivot);

        return index - 1;
    }

    private static void partitionTopK(int[] a, int start, int end, int k) {

        if (k == 0) {
            return;
        }

        int left = start;
        int right = end;
        int partitionIndex = partition(a, left, right);

        if (right - partitionIndex + 1 < k) {
            partitionTopK(a, left, partitionIndex - 1, k - (right - partitionIndex + 1));
        } else if (right - partitionIndex + 1 > k) {
            partitionTopK(a, partitionIndex + 1, end, k);
        } else {
            return;
        }
    }

    private static int[] quickTopK(int[] a, int k) {
        int left, right;
        left = 0;
        right = a.length - 1;
        partitionTopK(a, left, right, k);

        return Arrays.copyOfRange(a, a.length - k, a.length);
    }

    private static void buildMinHeap(int[] a, int k) {
        for (int i = k / 2; i >= 0; i--) {
            heapAdjust(a, i, k);
        }
    }

    private static void heapAdjust(int[] a, int parentIndex, int length) {
        int leftIndex = parentIndex * 2 + 1;
        int rightIndex = parentIndex * 2 + 2;
        int smallest = parentIndex;

        if (leftIndex < length && a[leftIndex] < a[smallest]) {
            smallest = leftIndex;
        }

        if (rightIndex < length && a[rightIndex] < a[smallest]) {
            smallest = rightIndex;
        }

        if (smallest != parentIndex) {
            swap(a, smallest, parentIndex);
            heapAdjust(a, smallest, length);
        }
    }

    private static int[] heapTopK(int[] a, int k) {

        buildMinHeap(a, k);

        int length = a.length;
        int smallest = a[0];

        for (int i = k; i < length; i++) {
            if (a[i] > smallest) {
                swap(a, i, 0);
                heapAdjust(a, 0, k);
                smallest = a[0];
            }
        }

        return Arrays.copyOfRange(a, 0, k);
    }


    public static void main(String[] args) {

        int count, max, k;
        count = 20;
        max = 100;
        k = 5;

        int[] randomInts = getRandomInts(count, max);
        if (randomInts == null) {
            return;
        }

        int[] quickRandomInts = Arrays.copyOf(randomInts, randomInts.length);
        int[] quickTopK = quickTopK(quickRandomInts, k);
        System.out.println(Arrays.toString(quickTopK));

        int[] heapRandomInts = Arrays.copyOf(randomInts, randomInts.length);
        int[] heapTopK = heapTopK(heapRandomInts, k);
        System.out.println(Arrays.toString(heapTopK));


    }
}


