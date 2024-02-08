package LinkedList;

public class MergeSortLL {
    private ListNode head;
    private ListNode tail;

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

        // Sample Input for Merge Sort
        ListNode headMergeSort = mergeSortLL.createLinkedList(new int[]{3, 2, 4, 1, 5});
        System.out.println("Original Linked List (Merge Sort):");
        mergeSortLL.printList(headMergeSort);

        // Sorting the linked list using Merge Sort
        ListNode sortedHeadMergeSort = mergeSortLL.sortList(headMergeSort);
        System.out.println("\nSorted Linked List (Merge Sort):");
        mergeSortLL.printList(sortedHeadMergeSort);

        // Sample Input for Bubble Sort
        ListNode headBubbleSort = mergeSortLL.createLinkedList(new int[]{3, 2, 4, 1, 5});
        System.out.println("\nOriginal Linked List (Bubble Sort):");
        mergeSortLL.printList(headBubbleSort);

        // Sorting the linked list using Bubble Sort
        mergeSortLL.head = headBubbleSort; // Set the head of the list for sorting
        mergeSortLL.bubbleSort();
        System.out.println("\nSorted Linked List (Bubble Sort):");
        mergeSortLL.printList(mergeSortLL.head);
    }


    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(); // Dummy node without a value
        for (int i = values.length - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(values[i]);
            newNode.next = dummy.next;
            dummy.next = newNode;
        }
        return dummy.next; // Return the next node after the dummy node
    }public void bubbleSort(){
        int size = getSize()-1;
        bubbleSort(size,0);
    }
    private int getSize() {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    private void bubbleSort(int row , int col){
        if (row == 0){
            return;
        }
        if (col<row){
            ListNode first = get(col);
            ListNode second = get(col+1);

            if (first.value > second.value){
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                    if (second.next == null)
                        tail = second; // Update tail if necessary
                } else if (second == tail) {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public ListNode get(int index){
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
