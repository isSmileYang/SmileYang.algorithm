package Greedy;

import java.util.Scanner;

public class Length_LIS {
    /**
     * 思路：在大循环中记录每个数
     * @param nums
     */
    public static int lengthOfLIS(int[] nums) {
        if(nums.length<2)return nums.length;
        int[]LIS = new int[nums.length];
        //数组有负整数的情况
        LIS[0] = nums[0];
        int end =0;
        for(int i =1;i<nums.length;i++){
            //如果该位元素大于子序列最后一位，上升子序列变长1
            if(nums[i]>LIS[end]){
                end++;
                LIS[end]=nums[i];
            }//如果当前nums[i]小于子序列最后一位，则用二分法搜索子序列中比nums[i]大的最小数
            else{
                int left = 0,right =end;
                while(left<right){
                    int pivot = (left+ right)/2;
                    if( LIS[pivot]< nums[i]){
                        left = pivot+1;
                    }
                    else{
                        assert LIS[pivot] >= nums[i];
                        right = pivot;
                    }
                }
                LIS[right]=nums[i];
            }
        }
        return end+1;
    }
    //just for test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] arr = s.split(",");
        int[] arry = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arry[i] = Integer.parseInt(arr[i]);
        }
        int result = lengthOfLIS(arry);
        System.out.println(result);
    }
}
