package Inheritance;

public class Class2 extends Class1{
    void sub(){
        System.out.println("subtraction: "+(n1-n2));
    }
    public static void main(String[] args){
        Class2 c=new Class2();
        c.n1=100;
        c.n2=10;
        c.add();
        c.sub();
    }
}
