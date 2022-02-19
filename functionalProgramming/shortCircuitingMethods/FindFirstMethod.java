package functionalProgramming.shortCircuitingMethods;
import java.util.*;
public class FindFirstMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
//        names.add("AEC");
        names.add("XYZ");
//        names.add("ABC");
        names.add("UVW");
        names.add("DEF");
        Optional<String> s=  names.stream()
                .filter(i->i.startsWith("A")).findFirst();
        if(s.isPresent()) System.out.println(s.get());
        else System.out.println("Not found");
    }
}
