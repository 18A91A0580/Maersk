package functionalProgramming.shortCircuitingMethods;
import java.util.*;
public class limitMethod {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5);
        l.stream()
                .limit(3)                        //It will limit the elements in the stream
                .forEach(System.out::println);
    }
}
