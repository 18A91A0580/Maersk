package functionalProgramming.optionalClass;

public class Student {
    private int rollNo;
    private String name;
    private String branch;
    Student(int rollNo, String name, String branch){
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
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
}
