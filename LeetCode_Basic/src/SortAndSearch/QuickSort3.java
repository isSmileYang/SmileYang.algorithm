package SortAndSearch;
import java.util.*;

public class QuickSort3 {
    /**
     *快排思想：分治，递归地调用切分来排序
     */
    public static void quickSort(int[] arr,int lo ,int hi){
        if(lo<hi) {
            //先找切分左右子序列的index,将它的初始位置优化，序列里随机分布的大量重复元素可不必重新递归调用
            int index = partition(arr, lo, hi);
            quickSort(arr, lo, index - 1);
            quickSort(arr, index + 1, hi);
        }
    }
    //先通过partition方法将切分元素index的左右子序列进行排序
    public static int partition(int[] arr,int lo,int hi){
        //取左位为基准元素,则先从右边开始对比
        int key=arr[lo];
        //这里不用交换直接赋值
        while(lo<hi){
            //从序列右端开始，向左遍历，直到找到小于base的数
            while(arr[hi]>=key && hi>lo){ hi--; }
            arr[lo]=arr[hi]; //找到了比base小的元素，放到最左边
            //从序列左端开始，向右遍历，直到找到大于base的数
            while(arr[lo]<=key && hi>lo){ lo++; }
            arr[hi]=arr[lo]; //找到了比base大的元素，放到最右边
        }
        arr[lo]=key;//将备份的切分元素放回左右子序列之间
        return lo; // 此时lo=hi，切分元素给arr[lo]和arr[hi]一样

    }

    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 49; i >=0; i++) {
            arr[i] = i;
            quickSort(arr,0,arr.length);
        }
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
