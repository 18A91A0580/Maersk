package sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class hashSet {
    public static void main(String[] args){
        // A set doesn't contain duplicate elements
        Set<Integer> st=new HashSet<>();  //order of added elements are not sequential
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.remove(2); //specify the element
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains(3));
        Set<Integer> stt=new HashSet<>();
        stt.add(5);
        stt.add(4);
        System.out.println(st.containsAll(stt));
        Set<String> st1=new HashSet<>();
        st1.add("Banana");
        st1.add("Apple");
        st1.add("Kiwi");
        System.out.println(st1);
        st1.remove("Kiwi");
        st1.clear();
        System.out.println(st1);
        Set<Integer> st2=new HashSet<>();
        st2.add(6);
        st2.add(7);
        st2.add(8);
        st.addAll(st2); //union
        System.out.println(st);
        st.retainAll(st2); //intersection
        System.out.println(st);
        //converting set lo list
        ArrayList<Integer> al=new ArrayList<>();
        al.addAll(st);
        System.out.println(al);
        for(int e:st){
            System.out.print(e+" ");
        }
    }
}
