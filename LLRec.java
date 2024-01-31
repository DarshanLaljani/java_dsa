package LinkedList;

public class LLRec {
    public static void main(String[] args) {
        LLRec list = new LLRec();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertRec(88,2);
        list.display();
    }
    public void insertRec(int val , int index){
        head=insertRec(val,index,head);
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size +=1;
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }
    private Node head;
    private Node tail;
    private int size;
    public LLRec(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }


    }
}
