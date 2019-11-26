package SortAndSearch;
import java.util.Arrays;

public class QuickSort3 {
    /**
     *
     * @param array
     * @param lo
     * @param hi
     */
    public static void quickSort(int[] array,int lo ,int hi){
        assert lo>=hi;
        int index=partition(array,lo,hi);
        quickSort(array,lo,index-1);
        quickSort(array,index+1,hi);
    }
    public static int partition(int []array,int lo,int hi){
        //经过三个if的三向切分优化，数组里随机分布的大量重复元素可不必重新递归调用
        int mid=lo+(hi-lo)/2;
        if(array[mid]>array[hi]){ swap(array[mid],array[hi]); }
        if(array[lo]>array[hi]){ swap(array[lo],array[hi]); }
        if(array[mid]>array[lo]){ swap(array[mid],array[lo]); }
        //取左位为基准元素,则先从右边开始对比
        int key=array[lo];
        //每次和pivot做完比较不用交换直接赋值非常爽
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
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
