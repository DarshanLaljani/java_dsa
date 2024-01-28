package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    public void insertFirstDD(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;

        if (head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.val+ "->");
            last=node;
            node = node.next;
        }
        System.out.println("END");

        while(last!=null){
            System.out.print(last.val+ "->");
            last = last.prev;
        }
        System.out.println("END");
    }
    public void insertionLast(int val){

        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if (head==null){
            node.prev=null;
            head = node;
            return;
        }
        while (last.next!= null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;


    }
    class Node {
      int val;
      Node next ;
      Node prev;
      public Node(int val){
          this.val = val;
      }
      public Node (int val ,Node next, Node prev ){
          this.val=val;
          this.next=next;
          this.prev=prev;
      }
    }

}
