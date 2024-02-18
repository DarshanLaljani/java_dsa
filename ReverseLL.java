package LinkedList;

public class ReverseLL {
    Node head;
    Node tail;
    private int size;

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
    private int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    public Node reverseList(Node node) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev; // Update the head to the last node
        return head;
    }
    public Node reverseBetween(Node head , int left , int right){
        if (left==right){
            return head;
        }
        //skip the first left -1 node
        Node current = head;
        Node prev = null;
        for (int i = 0; current !=null && i < left-1; i++) {
            prev = current;
            current=current.next;
        }
        Node last = prev;
        Node newEnd = current;
        Node next = current.next;
        //reverse between left and right
        for (int i = 0; current!=null && i < right-left+1; i++) {


           current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;
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
//        list.reverse(list.head);
        list.reverseList(list.head);
        // Print the reversed linked list
        System.out.println("\nReversed Linked List:");
        list.printList();
        list.reverseBetween(list.head, 2,4);
        System.out.println("\nReversed between 2 and 4:");
        list.printList();
    }

}
