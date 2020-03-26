package SortAndSearch;

import java.util.Arrays;

/**
 * quicksort最坏复杂度是O(n^2),heapsort稳定在O(nlogn)
 */
public class HeapClass {
    private static void heapSort(int[] arr, int len) {
        //把无序数组构建成大顶堆,用于升序排列；
        for (int i = (len-2) / 2; i >= 0; i--) {
            buildMaxHeap(arr, i, len);
        }
        for(int j= len-1; j>0; j--){
            int temp = arr[j]; arr[j] = arr[0]; arr[0] = temp;
            buildMaxHeap(arr,0,j);
        }
    }
    private static void buildMaxHeap(int[] arr, int parent, int len) {
        int child = 2 * parent+1;
        int max = arr[parent+1];
        //每个非叶子节点与孩子节点交换
        while(child < len ){
            //如果有右孩子且右孩子>左孩子，则定位到右孩子
            if (child+1 < len && arr[child+1] > arr[child]) child++;
            //父节点的值不小于孩子，此次二叉堆不调整
            if(arr[child]<=max)break;
            arr[parent] = arr[child];
            parent = child;
            child = 2*child;
        }
        arr[parent]=max;
    }

    public static void main(String[] args) {
        int[]arr = new int[]{0};
        heapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
