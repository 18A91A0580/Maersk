package Interfaces;

public class Class1 implements Interface1,Interface2 {
    static void staticMethod(){
        System.out.println("Class1 static method");
    }
    @Override
    public void Method1() {
        System.out.println("Method1 Implemented");
    }

    @Override
    public void Method2() {
        System.out.println("Method2 Implemented");
    }
}
