package sets;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args){
        // order of added elements are sorted
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Kiwi");
        System.out.println(ts);
    }
}
