package linkedListMethods;
import java.util.LinkedList;
public class Methods {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        //methods same as array list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.add(1,1);
        ll.set(1,6);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.peekFirst()); //returns head of the list
        System.out.println(ll.peekLast()); //returns tail of the list
        System.out.println(ll);
        System.out.println(ll.pollFirst()); //returns head and remove it from the list
        System.out.println(ll.pollLast());  //returns tail and remove it from the list
        System.out.println(ll);
        ll.add(1,10);
        for(int e:ll){
            System.out.print(e+" ");
        }
    }
}
