package DP;

/**
 * 最长递增子序列
 */
public class M300_LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        int len = 0; int start = 0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] <= nums[i-1]){
                start =i;
            }
            len = Math.max(len, i-start+1);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,6};
        int k = lengthOfLIS(nums);
        System.out.println(k);
    }
}
