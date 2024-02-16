package LinkedList;

public class ReverseLL {
    Node head;
    Node tail;

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
    }

    private void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();

        // Insert nodes into the linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Print the original linked list
        System.out.println("Original Linked List:");
        list.printList();

        // Reverse the linked list
        list.reverse(list.head);

        // Print the reversed linked list
        System.out.println("\nReversed Linked List:");
        list.printList();
    }
}
