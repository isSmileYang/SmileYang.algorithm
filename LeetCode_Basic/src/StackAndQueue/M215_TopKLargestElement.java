package StackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class M215_TopKLargestElement {
    /**
     * 1.维护一个大小为 K 的小顶堆，顺序遍历数组，从数组中取出取数据与堆顶元素比较。
     * 如果比堆顶元素大，我们就把堆顶元素删除，并且将这个元素插入到堆中；
     * 如果比堆顶元素小，则不做处理，继续遍历数组。
     * 这样等数组中的数据都遍历完之后，堆中的数据就是前 K 大数据
     *
     *  2.一次堆化操作需要 O(logK) 的时间复杂度，遍历数组O(n)，总时间复杂度O(nlogK)
     *
     */
    public static int findKthLargest(int[] nums, int k) {
        //时间复杂度：O(NlogK)
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
