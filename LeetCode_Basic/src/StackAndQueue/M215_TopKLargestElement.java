package StackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class M215_TopKLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = findKthLargest(nums,2);
        System.out.println(k);
    }
}
