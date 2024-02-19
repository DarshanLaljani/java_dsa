package LinkedList;

public class Palindrome {
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

    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid.next);
        mid.next = null; // Break the original list from the middle
        Node current1 = head;
        Node current2 = headSecond;
        while (current1 != null && current2 != null) {
            if (current1.value != current2.value) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        // Restore the original list (re-reverse the second half)
        mid.next = reverseList(headSecond);
        return true;
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper method to create a linked list from an array of values
    public Node createLinkedList(int[] values) {
        Node dummy = new Node();
        Node current = dummy;
        for (int value : values) {
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        // Create a palindrome linked list
        Node headPalindrome = palindrome.createLinkedList(new int[]{1, 2, 3, 2, 1});
        System.out.println("Palindrome Linked List:");
        palindrome.printList(headPalindrome);
        System.out.println("Is Palindrome: " + palindrome.isPalindrome(headPalindrome));

        // Create a non-palindrome linked list
        Node headNonPalindrome = palindrome.createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("\nNon-Palindrome Linked List:");
        palindrome.printList(headNonPalindrome);
        System.out.println("Is Palindrome: " + palindrome.isPalindrome(headNonPalindrome));
    }
}
