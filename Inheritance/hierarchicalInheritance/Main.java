package Inheritance.hierarchicalInheritance;

public class Main {
    public static void main(String[] args){
       MercedesBenz mb= new MercedesBenz();
        System.out.println("Mercedes Benz");
        System.out.println("Air Bags: "+mb.airBags);
        System.out.println("Engine Type "+mb.engineType);
        System.out.println("Mercedes have "+mb.wheels+" wheels");
        mb.start();
        mb.stop();
        Audi ad= new Audi();
        System.out.println("Audi");
        System.out.println("Air Bags: "+ad.airBags);
        System.out.println("Engine Type "+ad.engineType);
        System.out.println("Audi have "+ad.wheels+" wheels");
        ad.start();
        ad.stop();

    }
}
