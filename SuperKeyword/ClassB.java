package SuperKeyword;

public class ClassB extends ClassA {
    int n=20;
    void sameMethod(){
        System.out.println("Mehtod B");
    }
    void diff(){
        System.out.println(n);
        System.out.println(super.n);
       super.sameMethod();
        System.out.println("executed");
    }
}
