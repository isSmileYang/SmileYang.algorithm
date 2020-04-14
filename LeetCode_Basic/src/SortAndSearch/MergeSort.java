package SortAndSearch;

import java.util.Arrays;

/**
 * Created by chengxiao on 2016/12/8.
 */
public class MergeSort {
    public static void main(String []args){
        int []arr = {5,4,3,2,1,6,7,8,9};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            Merge(A, p, q, r);
        }
    }
    //为了能够正常处理边界情况，在每个待Merge的数组的末尾添加了一个无穷大的哨兵。
    public static void Merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            left[i] = A[p + i];
        }
        left[n1] = Integer.MAX_VALUE;
        for (int j = 0; j < n2; j++) {
            right[j] = A[q + 1 + j];
        }
        right[n2] = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;
        for (int k = p; k <= r; k++) {
            if (left[x] < right[y]) {
                A[k] = left[x];
                x++;
            } else {
                A[k] = right[y];
                y++;
            }
        }
    }
}