package SortAndSearch;
import java.util.Arrays;

public class QuickSort3 {
    /**
     *快排思想：分治，递归地调用切分来排序
     * @param arr
     * @param lo
     * @param hi
     */
    public static void quickSort(int[] arr,int lo ,int hi){
        assert lo>=hi;
        //经过三个if的三向切分，将切分元素key的初始位置优化，序列里随机分布的大量重复元素可不必重新递归调用
        int index=partition(arr,lo,hi);
        quickSort(arr,lo,index-1);
        quickSort(arr,index+1,hi);
    }
    //先通过partition方法将切分元素index的左右子序列进行排序
    public static int partition(int []arr,int lo,int hi){
        //取左位为基准元素,则先从右边开始对比
        int key=arr[lo];
        //这里不用交换直接赋值
        while(lo<hi){
            while(arr[hi]>=key&&hi>lo){
                hi--;
            }
            arr[lo]=arr[hi];
            while(arr[lo]<=key&&hi>lo){
                lo++;
            }
            arr[hi]=arr[lo];
        }
        arr[hi]=key;//将备份的切分元素放回左右子序列之间
        return hi;
    }

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int[]arr = new int[]{4,7,6,5,3,2,8,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
