package SortAndSearch;

import java.util.Arrays;

public class shellSort {
    public static int[] shellSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int gap = arr.length >> 1;
        while (gap >=1) {
            // 每组进行直接插入排序。
            for (int i = gap; i < arr.length; i++) {    // i 代表待插入元素的索引。
                int  t = arr[i];
                int j = i - gap;   // j代表i相差一个增量gap的上一个元素。
                // j < 0 时退出循环，说明 j 是最小的元素的索引值。
                // 或者 arr[j] <= value 时退出循环，说明 j 是比value小的元素的索引值。
                while(j >= 0 && arr[j] > t) {
                    arr[j + gap] = arr[j];  // 把元素往后挪。
                    j -= gap;
                }
                arr[j + gap] = t;
            }
            gap /= 2;// 缩小增量。
        }
        return arr;
    }
     public static void main(String[]args){
         int []arr = {3,4,5,6,1,2};
         shellSort(arr);
         System.out.println(Arrays.toString(arr));
     }
}
