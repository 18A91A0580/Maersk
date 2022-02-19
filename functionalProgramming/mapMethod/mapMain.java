package functionalProgramming.mapMethod;

import java.util.*;
import java.util.stream.Collectors;

public class mapMain {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"ABC","CSE"));
        studentList.add(new Student(2,"DEF","ECE"));
        studentList.add(new Student(3,"GHI","CSE"));
        studentList.add(new Student(4,"JKL","IT"));
        studentList.add(new Student(5,"MNO","CSE"));
        studentList.add(new Student(6,"PQR","IT"));
        studentList.add(new Student(7,"STU","ECE"));
        studentList.add(new Student(8,"VWX","CSE"));
        List<Integer> l=studentList.stream()
                .map(i->i.getRollNo()+1).collect(Collectors.toList());
        System.out.println(l);
    }
}
