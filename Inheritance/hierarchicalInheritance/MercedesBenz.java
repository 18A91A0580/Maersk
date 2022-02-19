package Inheritance.hierarchicalInheritance;

public class MercedesBenz extends Car{

    MercedesBenz(){
        super.airBags=6;
        super.engineType="Diesel";
    }
    @Override
    public void start(){
        System.out.println("Mercedes Benz was started");
    }
    @Override
    public void stop(){
        System.out.println("Mercedes Benz was stopped");
    }
}
