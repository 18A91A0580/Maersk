package linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.show();
        ll.insertAtStart(0);
        ll.show();
        ll.insertAt(3,4);
        ll.show();
        ll.deleteAt(3);
        ll.show();
    }
}
