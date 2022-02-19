package Interfaces.multipleInheritance;

public class Sample implements Interface1,Interface2{
//    @Override
//    public void show(){
//        System.out.println("Overrided");
//    }
    @Override
    public void show(){
        Interface1.super.show();
        Interface2.super.show();
    }
    public static void main(String[] args){
       Sample s=new Sample();
        s.show();
//        s.n=20;
        System.out.println(n);
    }
}
