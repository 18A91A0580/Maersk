package functionalProgramming.flatMapMethod;
import java.util.*;
public class Student {
    private int rollNo;
    private String name;
    private String branch;
    private List<String> phnNumbers;
    Student(int rollNo,String name,String branch,List<String> phnNumbers){
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.phnNumbers=phnNumbers;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public List<String> getPhnNumbers(){
        return phnNumbers;
    }
}
