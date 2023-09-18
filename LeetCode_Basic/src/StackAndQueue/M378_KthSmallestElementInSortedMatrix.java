package StackAndQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class M378_KthSmallestElementInSortedMatrix {
    /**
     * 遍历矩阵中的元素，将元素添加到队列中，如果队列中元素数目MaxPQ.size() > k，就将堆点最大的元素弹出。
     * 时间复杂度为O(n^2log(k))，空间复杂度为O(k)
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] row : matrix){
            //内循环是从左到右遍历一行值
            for(int num : row){
                //当前元素的右边元素比当前元素更大，也没必要放入队列
                if(maxHeap.size() == k && num > maxHeap.peek()) break;
                maxHeap.add(num);
                if(maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4,5,6},{7,8,9,10}};
        int k = kthSmallest(matrix,9);
        System.out.println(k);
    }
}
