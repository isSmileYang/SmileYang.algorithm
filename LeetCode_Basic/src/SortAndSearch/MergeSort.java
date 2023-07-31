package SortAndSearch;

import java.util.Arrays;

/**
 * Created by chengxiao on 2016/12/8.
 */
public class MergeSort {
    public static void main(String []args){
        int[] arr = {5,4,3,2,1,6,7,8,9};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int q = (start + end) / 2;
            mergeSort(arr, start, q);
            mergeSort(arr, q + 1, end);
            merge(arr, start, q, end);
        }
    }
    //为了能够正常处理边界情况，在每个待Merge的数组的末尾添加了一个无穷大的哨兵。
    public static void merge(int[] arr, int start, int mid, int end) {
        //用临时数组temp组装合并的数组
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int t = 0; //t指针指向temp的初始位置
        while( i<= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[t++] = arr[i++];
        }
        while(j <= end){
            temp[t++] = arr[j++];
        }
        for(int p = 0; p < temp.length; p++){
            arr[start + p] = temp[p];

        }
    }
}