package linkedList;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insertAt(int index,int data){
        if(index==0) insertAtStart(data);
        else {
            Node node = new Node();
            node.data = data;
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        Node n1=n.next;
        n.next=n1.next;
    }
    public void show(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
}
