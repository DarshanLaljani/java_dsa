package LinkedList;

public class MergeLL {
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

public static MergeLL merge(MergeLL first , MergeLL second){
        Node f = first.head;
        Node s = second.head;
        MergeLL ans = new MergeLL();
        while(f!=null & s!=null){
            if(f.value<s.value){
                ans.insert(f.value);
               f= f.next;
            }else {
                ans.insert(s.value);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insert(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insert(s.value);
            s=s.next;
        }
        return ans;
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
        MergeLL list1 = new MergeLL();
        MergeLL list2 = new MergeLL();
        list1.insert(1);
        list1.insert(3);
        list2.insert(1); // Adding a duplicate for testing
        list2.insert(2);
        list2.insert(9);

        MergeLL ans = MergeLL.merge(list1,list2);
        ans.display();

    }
}