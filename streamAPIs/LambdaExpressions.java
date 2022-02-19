package streamAPIs;
@FunctionalInterface
interface Car{
//    void book();  //1
//    void book(String s,String d); //2
    int book();
}
public class LambdaExpressions {

    public static void main(String[] args) {
//        Car c = () -> System.out.println("Car was booked"); //1
//        c.book();
//        Car c = (s,d) -> System.out.println("Car was booked from "+s+" to "+d);  //2
//        c.book("rayavaram","kakinada");
        Car c= ()-> {
            System.out.println("Car was booked");
            return 1000;
        };
        int fare=c.book();
        System.out.println(fare);
    }
}

