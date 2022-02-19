package functionalProgramming.shortCircuitingMethods;

import java.util.ArrayList;
import java.util.List;

public class NoneMatchMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("AEC");
        names.add("XYZ");
        names.add("ABC");
        names.add("UVW");
        names.add("DEF");
        boolean isFound=  names.stream()
                .noneMatch(i->i.startsWith("B"));
        System.out.println("None start with B : "+isFound);
    }
}
