package SortAndSearch;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        if(nums.length <=1 && nums[0] != target){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
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
