package SortAndSearch;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = { 5 , 2 , 6 , 0 , 9 };
        //打印排序前的数据
        System.out.println("排序前的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //直接插入排序
        binaryInsertSort(arr);
        //打印排序后的数据
        System.out.println();
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void binaryInsertSort(int arr[]){

        for(int i = 1;i<arr.length;i++){
            //折半查找应该插入的位置
            int low = 0;
            int high = i-1;
            while(low <= high){
                int m = (low+high)/2;
                if(arr[m] > arr[i])
                    high = m - 1;
                else
                    low = m + 1;
            }
            //统一移动元素，然后将这个元素插入到正确的位置
            int temp = arr[i];
            for(int j=i;j>high+1;j--){
                arr[j] = arr[j-1];
            }
            arr[high+1] = temp;
        }
    }
}
