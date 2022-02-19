package Abstraction;

public abstract class ClassA {
    abstract void Method();
    // abstract class can contain both abstract and non-abstract methods
    // And cannot instantiated
    // It can have data members
    int n=10;
    void Method2(){
        System.out.println("Non-abstract method");
    }
}
