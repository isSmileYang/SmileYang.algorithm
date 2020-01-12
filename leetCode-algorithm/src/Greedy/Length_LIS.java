package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Length_LIS {
    /**
     *输入: [10,9,2,5,3,7,101,18]，输出: 4
     * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
     * 思路：用一个数组来存放上升序列，关键在于最后输出的是序列长度，所以保证长度而不需要时刻记录真正的子序和
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
                    int pivot = left+(right-left)/2;
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
