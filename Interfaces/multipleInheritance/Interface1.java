package Interfaces.multipleInheritance;

public interface Interface1 {
    int n=10;
    default void show(){
        System.out.println("In Interface1");
    }
}
