package Interfaces;

public interface Interface1 {
    // An interface cannot be instantiated
    // It cannot have constructors
    void Method1();
    // It can have static methods
    static void staticMethod(){

        System.out.println("Static method");
    }
    // It can have default methods

    int n=10;
    default void defaultMethod(){
        System.out.println("Default Method");
        System.out.println(n);
    }
}
