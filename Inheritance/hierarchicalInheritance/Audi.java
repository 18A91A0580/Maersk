package Inheritance.hierarchicalInheritance;

public class Audi extends Car {
    Audi(){

        super.airBags=4;
        super.engineType="Petrol";
    }
    @Override
    public void start(){

        System.out.println("Audi was started");
    }
    @Override
    public void stop(){
        System.out.println("Audi was stopped");
    }
}
