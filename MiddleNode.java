package LinkedList;
public class MiddleNode {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        MiddleNode middleNode = new MiddleNode();

        // Sample Input 1: Odd number of nodes
        ListNode oddHead = middleNode.createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode middleNode1 = middleNode.middle(oddHead);
        System.out.println("Sample Input 1: Middle Node value: " + middleNode1.val);

        // Sample Input 2: Even number of nodes
        ListNode evenHead = middleNode.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode middleNode2 = middleNode.middle(evenHead);
        System.out.println("Sample Input 2: Middle Node value: " + middleNode2.val);
    }

    // Helper method to create a linked list
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
}
