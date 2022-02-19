package functionalProgramming.flatMapMethod;


import java.util.*;
import java.util.stream.Collectors;

public class flatMapMain {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"ABC","CSE", Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(2,"DEF","ECE",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(3,"GHI","CSE",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(4,"JKL","IT",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(5,"MNO","CSE",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(6,"PQR","IT",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(7,"STU","ECE",Arrays.asList("9000090000","9111191111")));
        studentList.add(new Student(8,"VWX","CSE",Arrays.asList("9000090000","9111191111")));
        List<List<String>> mapList=studentList.stream()
                .map(i->i.getPhnNumbers()).collect(Collectors.toList());
        System.out.println(mapList);
        List<String> flatMapList=studentList.stream().flatMap(i->i.getPhnNumbers().stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
    }

}
