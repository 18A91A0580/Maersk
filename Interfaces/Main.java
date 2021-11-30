package Interfaces;

public class Main {
    public static void main(String[] args){
        Class1 c1=new Class1();
        c1.Method1();
        c1.Method2();
        Interface1.staticMethod(); // static method can only be instantiated with Interface name
        c1.defaultMethod();
    }
}
