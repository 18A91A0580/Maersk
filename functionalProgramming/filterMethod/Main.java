package functionalProgramming.filterMethod;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
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
        System.out.println("ECE Students:");
//        studentList.stream().filter(i->i.getBranch()=="ECE").map(i->i.getName()).forEach((System.out::println));
        System.out.println(studentList.stream().filter(i->i.getBranch()=="ECE").map(i->i.getName()).collect(Collectors.toList()));
        System.out.println("CSE Students:");
        studentList.stream().filter(i->i.getBranch()=="CSE").map(i->i.getName()).forEach(System.out::println);
//        System.out.println(studentList.stream().filter(i->i.getBranch()=="CSE").map(i->i.getName()).collect(Collectors.toList()));
        System.out.println("IT Students:");
        studentList.stream().filter(i->i.getBranch()=="IT").map(i->i.getName()).forEach(System.out::println);
//        System.out.println(studentList.stream().filter(i->i.getBranch()=="IT").map(i->i.getName()).collect(Collectors.toList()));
    }
}
