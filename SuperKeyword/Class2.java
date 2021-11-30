package SuperKeyword;

public class Class2 extends Class1 {
    Class2(){

       super(2); // super() constructor must be the first statement in child class constructor
        int b=10;
    }
//    void call(){     we cannot call super() in a method
//        super(2);
//    }
    public static void main(String[] args){
        Class2 c=new Class2();
//        c.call();
    }
}
