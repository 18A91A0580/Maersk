package Abstraction;
public class Main {
    public static void main(String[] args){
        ClassA a=new ClassB();
        System.out.println(a.n);
        ClassB b=new ClassB();
        b.Method();
        b.Method2();
        System.out.println(b.n);
        ClassC c=new ClassC();
        c.Method();
        c.Method();
    }
}
