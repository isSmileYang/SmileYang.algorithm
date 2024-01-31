package org.smileyoung.leetcode;

import org.smileyoung.core.ListNode;

import java.util.List;
import java.util.Objects;

/**
 * @author wenxiyang
 * @date 2024-02-01
 */
public class M206_ReverseList_recursion {
    public static void main(String[] args) {
        ListNode<Integer> l5 = new ListNode<>(5, null);
        ListNode<Integer> l4 = new ListNode<>(4, l5);
        ListNode<Integer> l3 = new ListNode<>(3, l4);
        ListNode<Integer> l2 = new ListNode<>(2, l3);
        ListNode<Integer> l1 = new ListNode<>(1, l2);

        ListNode<Integer> integerListNode = recursionReverseList(l1);
        System.out.println(integerListNode);
    }

    static <T> ListNode<T> recursionReverseList(ListNode<T> head) {
        // 思路：相邻元素反转 -> head.next.next=head; head =null;
        // 但是要从最后一个元素递归处理
        if (Objects.isNull(head) || Objects.isNull(head.getNext())) {
            // 最后一个节点
            return head;
        }

        // 先递归处理下一个节点
        ListNode<T> newHead = recursionReverseList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }
}
