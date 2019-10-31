package SortAndSearch;

import Structure.ListNode;
/**
 * 148.排序序链表----递归的归并排序解法，时间复杂度O(nlogn),空间是O（1）
 * 链表排序不需要额外空间！！！通常的归并排序需要copy一个栈来存数组，空间O(n)
 * 第一步：算出链表长度，取到中间节点（考虑奇数问题），打断链表
 * 第二步：合并有序链表（递归合并），每次只判断表头即可
 */

public class MergeSortList {
    public ListNode sortTest(ListNode head) {
        if (head == null) return head;
        ListNode countNode = head;
        /* 计算出链表的长度 */
        int count = 0;
        while (countNode != null) {
            count++;
            countNode = countNode.next;
        }
        return sortList(head, count);
    }
    /**
     * 排序链表
     * @param head
     * @param count
     */
    private ListNode sortList(ListNode head, int count) {
        //递归结束条件
        if (count <= 1) return head;
        ListNode leftEnd = head;
        for (int i = 0; i < count / 2 - 1; i++) {
            leftEnd = leftEnd.next;
        }
        ListNode rightStart = leftEnd.next;
        //断链，如果不断链，各种判断让你死去活来
        leftEnd.next = null;
        //合并两个已经排完序的链表
        //第二个链表的长度为count - count / 2，不能直接是count / 2，奇数计算会错误！！！
        return merge(
                sortList(head, count / 2),
                sortList(rightStart, count - count / 2)
        );
    }
    /**
     * 合并有序的链,使用递归更加简洁和易懂，每次只比较两个链表的链头
     * @param l1
     * @param l2
     */
    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head;
        //已经排完序之间凭拼接就好
        if (l1.val <= l2.val) {
            head = l1;
            l1.next = merge(l1.next, l2);
        } else {
            head = l2;
            l2.next = merge(l1, l2.next);
        }
        return head;
    }

    public static void main(String[] args) {

    }
}



