package SortAndSearch.binarysearch;

import com.sun.javaws.IconUtil;

public class M287_FindDuplicateNumber {


    public static void main(String []args){
        int[] arr = {1,2,2,3,4,5};

        int binaryResult = findDuplicate(arr);
        System.out.println(binaryResult);
    }
    /**
     * 二分法利用了「抽屉原理」
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        int left = 1;// 在 [1..n] 查找 nums 中重复的元素
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right - left)/2;
            int count = 0;
            // nums 中小于等于 mid 的元素的个数
            for(int num : nums){
                if(num <= mid) count++;

            }
            //count > mid说明重复元素一定出现在 [left..mid]
            if(count > mid){
                right = mid -1;
            }else{
                left = mid + 1 ;
            }
        }
        return left;
    }
}
