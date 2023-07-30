package 链表;

public class Main {
    public static void main(String[] args) {
        // 构建链表: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = createLinkedList(1,2,3,4,5,6);

        // 打印原始链表
        System.out.println("原始链表:");
        printLinkedList(head);

        // 反转从位置2到位置4的节点
        ReverseList solution = new ReverseList();
        int left = 2;
        int right = 4;
        head = solution.reverseBetween(head, left, right);

        // 打印反转后的链表
        System.out.println("反转后的链表:");
        printLinkedList(head);
    }
    // 辅助函数用于构建链表
    private static ListNode createLinkedList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    // 打印链表的函数
    private static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
