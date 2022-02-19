package functionalProgramming.lambdaExpressions;



@FunctionalInterface
interface Car{
    //    void book();
//    void book(String s1,String s2);
    int book();
    static int get(){
        int a=1000;
        return a;
    }
    default void printCar(){
        System.out.println("Car");
    }
}
public class LambdaExpressions {
    public static void main(String[] args) {
//        Car c1=()-> System.out.println("Car was booked");
//        c1.book();
//        Car c2=(s,d)-> System.out.println("Car was booked from "+s+" to "+d);
//        c2.book("abc","xyz");
        Car c3=()->{
            System.out.println("Car was booked");
            return Car.get();
        };
        int fare=c3.book();
        System.out.println(fare);
    }
}

