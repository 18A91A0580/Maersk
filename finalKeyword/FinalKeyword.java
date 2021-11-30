package finalKeyword;

public class FinalKeyword {
    final int i=10;  // cannot be changed
    final void method(){     // cannot be overridden
        System.out.println("final method");
    }
    //if a class is final, it cannot be extended by another class
}
