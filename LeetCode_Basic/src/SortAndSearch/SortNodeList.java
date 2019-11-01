package SortAndSearch;


import Structure.ListNode;

/**
 * 排序链表
 * @author
 */
public class SortNodeList {

    /**
     * 对链表进行排序：从小到大
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        //记录每次循环的最小值
        int temp ;
        ListNode curNode = head;
        while (curNode != null) {
            /**
             * 内重循环从当前节点的下一个节点循环到尾节点，
             * 找到和外重循环的值比较最小的那个，然后与外重循环进行交换
             */
            ListNode nextNode = curNode.next;
            while (nextNode != null) {
                //比外重循环的小值放到前面
                if (nextNode.data < curNode.data) {
                    temp = nextNode.data;
                    nextNode.data = curNode.data;
                    curNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    /**
     * 新增节点
     * @param data
     */
    public ListNode insertNode(int data, ListNode head) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return head;
        }
        ListNode curNode = head;
        //循环找到当前链表的尾节点
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        //尾节点的指针指向新增加的节点
        curNode.next = node;
        return head;
    }

    /**
     * 打印链表
     */
    public void printList(ListNode head) {
        ListNode curNode = head;
        //循环遍历到尾节点
        while (curNode != null) {
            System.out.print(curNode.data + "  ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortNodeList sortNode = new SortNodeList();

        //链表的头指针
        ListNode head = null;

        //新增节点,第一次新增时需要返回头指针，用于定位链表
        head = sortNode.insertNode(2, head);
        sortNode.insertNode(6, head);
        sortNode.insertNode(4, head);
        sortNode.insertNode(8, head);
        sortNode.insertNode(1, head);

        System.out.println("排序链表前：");
        sortNode.printList(head);

        //排序链表
        head = sortNode.sortList(head);

        System.out.println("排序链表后：");
        sortNode.printList(head);
    }
}
