package functionalProgramming.reduceMethod;
import java.util.*;
public class reduceMain {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"ABC","CSE",90));
        studentList.add(new Student(2,"DEF","ECE",80));
        studentList.add(new Student(3,"GHI","CSE",73));
        studentList.add(new Student(4,"JKL","IT",88));
        studentList.add(new Student(5,"MNO","CSE",93));
        studentList.add(new Student(6,"PQR","IT",87));
        studentList.add(new Student(7,"STU","ECE",92));
        studentList.add(new Student(8,"VWX","CSE",95));
        double totalMarks=studentList.stream()
                .map(i->i.getMarks())
                .reduce(0,(a,b)-> a + b);
        System.out.println(totalMarks);
        double avgMarks=studentList.stream().map(i->i.getMarks()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avgMarks);
    }
}
