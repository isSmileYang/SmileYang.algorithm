package SortAndSearch;

import java.util.Arrays;

public class HeapClass {
     //把无序数组构建成大顶堆：每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列；
    public static void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }
    public static void heapify(int[] arr, int i, int len) {
        //i节点的左右孩子
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        //孩子的值比父节点大则直接赋值给父节点
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        //把堆首（最大值）和堆尾互换；
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[]arr = new int[]{4,7,6,5,3,2,8,1};
        buildMaxHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
