package org.smileyoung.leetcode;

import org.smileyoung.core.ListNode;

import java.util.List;
import java.util.Objects;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * <p>
 * 提示：
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *
 * @author wenxiyang
 * @date 2024-02-01
 */
public class M206_ReverseList_Iterator {

    public static void main(String[] args) {
        ListNode<Integer> l5 = new ListNode<>(5, null);
        ListNode<Integer> l4 = new ListNode<>(4, l5);
        ListNode<Integer> l3 = new ListNode<>(3, l4);
        ListNode<Integer> l2 = new ListNode<>(2, l3);
        ListNode<Integer> l1 = new ListNode<>(1, l2);

        ListNode<Integer> integerListNode = iteratorReverse(l1);
        System.out.println(integerListNode);
    }

    static <T> ListNode<T> iteratorReverse(ListNode<T> head) {
        // 思路：遍历链表，先缓存next，再重置next
        if (Objects.isNull(head)) {
            return null;
        }
        ListNode<T> current = head;
        ListNode<T> prev = null;
        while (Objects.nonNull(current.getNext())) {
            ListNode<T> next = current.getNext();
            current.setNext(prev);
            // prev 设置为当前node
            prev = current;
            // 遍历下一个
            current = next;
        }

        return prev;
    }
}
