package SortAndSearch.binarysearch;

public class M33_SearchRotatedSortedArray {
    /**
     * 要考虑target正好=nums[left]或者=nums[right]
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0; int right = nums.length -1;
        int mid =0;
        while(left <= right){
            mid = left + (right - left)/2 ;
            if(nums[mid] == target) return mid;
            //[left,mid]有序
            if(nums[mid] >= nums[left]){
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid -1;
                }else {
                    left = mid +1;
                }
            }//[mid，right]有序
            else {
                if(nums[mid] < target && target <= nums[right] ) {
                    left = mid +1;
                }else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String []args){
        int[] arr = {5,1,2,3,4};
        int res = search(arr,1);
        System.out.println(res);
    }
}
