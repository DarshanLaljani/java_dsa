package LinkedList;

public class CLLOperations {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(12);
        list.insert(2);
        list.insert(223);
        list.display();
        list.delete(12);
        list.display();
    }


}
