package sets;
import java.util.LinkedHashSet;
public class linkedHashSet {
    public static void main(String[] args){
        //the order of added elements are in sequential but the time complexity increases
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Banana");
        lhs.add("Apple");
        lhs.add("Kiwi");
        System.out.println(lhs);
    }
}
