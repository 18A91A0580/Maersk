package functionalProgramming.shortCircuitingMethods;

import java.util.ArrayList;
import java.util.List;

public class AllMatchMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("AEC");
        names.add("XYZ");
        names.add("ABC");
        names.add("UVW");
        names.add("DEF");
        boolean isFound=  names.stream()
                .allMatch(i->i.startsWith("A"));
        System.out.println("All are matched: "+isFound);
    }
}
