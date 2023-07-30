package 链表;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 定位 left 的前一个节点
        ListNode preLeft = dummy;
        for (int i = 1; i < left; i++) {
            preLeft = preLeft.next;
        }
        // 定位 right 的节点
        ListNode rightNode = preLeft;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        // 断开链表
        ListNode leftNode = preLeft.next;
        ListNode afterRight = rightNode.next;
        preLeft.next = null;
        rightNode.next = null;
        // 反转从 left 到 right 的链表段
        this.reverseList(leftNode);
        // 重新连接链表
        preLeft.next = rightNode;
        leftNode.next = afterRight;
        return dummy.next;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(nums);
        int left = 2;
        int right = 4;

        ReverseList solution = new ReverseList();
        ListNode reversedHead = solution.reverseBetween(head, left, right);

        printLinkedList(reversedHead); // Output: 1 4 3 2 5
    }

    // 辅助方法：用于创建链表
    public static ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
    // 辅助方法：用于打印链表
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
