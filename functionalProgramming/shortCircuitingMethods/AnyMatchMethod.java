package functionalProgramming.shortCircuitingMethods;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("AEC");
        names.add("XYZ");
        names.add("ABC");
        names.add("UVW");
        names.add("DEF");
        boolean isFound=  names.stream()
                .anyMatch(i->i.startsWith("A"));
        System.out.println("Element found: "+isFound);
    }
}
