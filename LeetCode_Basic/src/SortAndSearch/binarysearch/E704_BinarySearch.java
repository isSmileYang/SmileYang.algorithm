package SortAndSearch.binarysearch;

/**
 *
 */
public class E704_BinarySearch {
    public static int search(int[] nums, int target) {
        if(nums.length <=1 && nums[0] != target){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        // 可能left = right 时指向target元素
        while(left <= right){
            //计算 mid 时 ，使用 （left + right ）/ 2 可能会导致溢出
            int mid = left +((right - left) >> 2);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int[] arr = {1,2,3,6,7,8,9};
        int res = search(arr,3);
        System.out.println(res);
    }
}
