package UsingListIterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class list_iterator {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ListIterator itr=al.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        // start iteration from a particular index
        ListIterator itr1=al.listIterator(1);
        while(itr1.hasNext()){
            System.out.print(itr1.next()+" ");
        }
        System.out.println();
        // Iterating in reverse order
        ListIterator itr2=al.listIterator(al.size());
        while(itr2.hasPrevious()){
            System.out.print(itr2.previous()+" ");
        }
        System.out.println();
        al.add(null);
        al.add(4);
        al.add(6);
        al.add(null);
        System.out.println(al);
        ListIterator itr3=al.listIterator();
        while(itr3.hasNext()){
            if(itr3.next()==null) {
                //removing elements
//                itr3.remove();
                //set the values
                itr3.set(0);
            }
        }
        System.out.println(al);
    }
}
