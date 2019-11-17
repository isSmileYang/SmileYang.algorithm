package SortAndSearch;

import Structure.ListNode;

import java.util.LinkedList;


/**
 * 148.排序序链表----递归的归并排序解法，时间复杂度O(nlogn),空间是O（1）
 * 链表排序不需要额外空间！！！通常的归并排序需要copy一个栈来存数组，空间O(n)
 */
public class MergeSortList {
    /**
     * 解题三部曲见题中注释
     *  第一步注意取到中间节点（考虑奇数问题），第二步注意合并有序链表（递归合并），每次只判断表头即可
     * @param head
     */
    private static ListNode mergeSort(ListNode head) {
        if (null==head ||null==head.next ) {
            return head;
        }
        //step1:cut the list to 2 halves
        ListNode p = head, q = head, pre = null;
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;

        //step2:sort each half
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        //step3:merge l1 and l2
        return MergeSortList.merge(l, r);
    }
    //合并有序链表
    static ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l != null && r != null) {
            //
            if (l.data <= r.data) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        if (l != null) {
            cur.next = l;
        }
        if (r != null) {
            cur.next = r;
        }
        return dummyHead.next;
    }

    /**
     * 以下纯测试，可省略。传入头结点指针
     * @param head
     * @return
     */
    public static ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }
    public static void main(String[] args) {
       LinkedList mylinklist = new LinkedList();
       mylinklist.add(0,5);
       mylinklist.add(1,2);
       mylinklist.add(2,6);
       mylinklist.add(3,5);
       mylinklist.add(4,1);
       mylinklist.add(5,4);
       ListNode node = (ListNode) mylinklist.getFirst();
       ListNode result = sortList(node);
       System.out.println(result);
    }
}



