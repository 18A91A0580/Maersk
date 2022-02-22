package functionalProgramming.optionalClass;


import javax.sound.midi.Soundbank;
import java.util.*;

public class optionalDemo {
    public static void main(String[] args) {
        Student st1=new Student(1,"AB","A");
        Optional<Object> op=Optional.empty(); // optional empty object
        System.out.println(op);

//        Optional<String> op1=Optional.of(st1.getBranch()); // check for null, if the object is null returns nullpointerexception
//        System.out.println(op1);                           //else return obj

        Optional<String> op2=Optional.ofNullable(st1.getBranch()); //returns empty optional object if object is null
//        System.out.println(op2.get());                      //else returns obj

//        if(op2.isPresent()) System.out.println(op2.get());

        System.out.println(op2.orElse("Not found"));
    }
}
