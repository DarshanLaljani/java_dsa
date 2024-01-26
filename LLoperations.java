package LinkedList;

public class LLoperations {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(18);
        list.insert(100,3);
        list.insertLast(99);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.display();
        
    }
}
