package functionalProgramming.sortedMethod;



import java.util.*;
import java.util.stream.Collectors;

public class sortedMain {
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
        Comparator<Student> com=(s1,s2)->{
            if(s1.getRollNo()>s2.getRollNo()) return -1;
            else if(s1.getRollNo()< s2.getRollNo()) return 1;
            return 0;
        };
        List<String> sortedList=studentList.stream().sorted(com).map(i->i.getName()).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
