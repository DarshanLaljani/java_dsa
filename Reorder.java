package LinkedList;

public class Reorder {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }

    public Node reorder(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the linked list into two halves
        Node secondHalf = slow.next;
        slow.next = null;

        // Reverse the second half of the linked list
        Node prev = null;
        Node current = secondHalf;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;

        // Merge the two halves back together
        Node firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            Node temp1 = firstHalf.next;
            Node temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }

        return head;
    }

    public static void main(String[] args) {
        Reorder reorder = new Reorder();

        // Create a sample linked list
        Node head = reorder.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        // Print the original linked list
        System.out.println("Original Linked List:");
        reorder.printList(head);

        // Reorder the linked list
        Node reorderedHead = reorder.reorder(head);

        // Print the reordered linked list
        System.out.println("\nReordered Linked List:");
        reorder.printList(reorderedHead);
    }

    // Helper method to create a linked list
    private Node createLinkedList(int[] values) {
        Node dummy = new Node(); // Dummy node without a value
        Node current = dummy;
        for (int value : values) {
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next; // Return the next node after the dummy node
    }

    // Helper method to print a linked list
    private void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
