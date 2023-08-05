package 链表;

public class M142_LinkedListCycle {
    public static ListNode detectCycle(ListNode head){
        if(head ==null) return head;
        ListNode slow = head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode meetNode = fast;
                ListNode headNode = head;
                while(meetNode != headNode){
                    meetNode = meetNode.next;
                    headNode = headNode.next;
                }
                return headNode;
            }
        }
        //没环
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3 };
        ListNode head = createLinkedList(nums);
        ListNode reversedHead = detectCycle(head);
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
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
}
