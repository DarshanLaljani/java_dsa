package LinkedList;

public class MergeSortLL {
    class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        public ListNode() {
        }
    }
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move the tail pointer
        }

        // Link the remaining nodes of either list1 or list2
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummyHead.next;
    }


    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // Keep track of the node before slow
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null; // Break the list into two halves
        }
        return slow;
    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middle(head);
        ListNode midNext = mid.next; // Keep the reference to the next node after mid
        mid.next = null; // Break the list into two halves
        ListNode left = sortList(head);
        ListNode right = sortList(midNext); // Pass mid's next node
        return merge(left, right);
    }


    public static void main(String[] args) {
        MergeSortLL mergeSortLL = new MergeSortLL();

        // Sample Input
        ListNode head = mergeSortLL.createLinkedList(new int[]{3, 2, 4, 1, 5});
        System.out.println("Original Linked List:");
        mergeSortLL.printList(head);

        // Sorting the linked list
        ListNode sortedHead = mergeSortLL.sortList(head);

        // Printing the sorted linked list
        System.out.println("\nSorted Linked List:");
        mergeSortLL.printList(sortedHead);
    }

    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(); // Dummy node without a value
        for (int i = values.length - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(values[i]);
            newNode.next = dummy.next;
            dummy.next = newNode;
        }
        return dummy.next; // Return the next node after the dummy node
    }



    // Helper method to print a linked list
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
