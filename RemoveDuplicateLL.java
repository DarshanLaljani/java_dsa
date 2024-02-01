package LinkedList;

public class RemoveDuplicateLL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // No need for duplicate method in this class
    }

    private Node head;
    private Node tail;
    private int size;

    private void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void duplicate() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        RemoveDuplicateLL list = new RemoveDuplicateLL();
        list.insert(1);
        list.insert(3);
        list.insert(3); // Adding a duplicate for testing
        list.insert(44);
        list.insert(44);


        System.out.println("Original Linked List:");
        list.display();

        list.duplicate();

        System.out.println("Linked List after removing duplicates:");
        list.display();
    }
}
