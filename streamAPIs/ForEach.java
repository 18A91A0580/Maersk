package streamAPIs;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2, 3);
//        1st method
//        Consumer<Integer> c=new Consumer<>(){
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };
//        al.forEach(c);

//2nd method
//        al.forEach(i -> System.out.println(i));
//        3rd method (call by method)
        al.forEach(System.out::println);
        System.out.println("After doubling");
        al.forEach(ForEach::doubleIt); // ClassName::function
    }
      public static void doubleIt(int i){
          System.out.println(i*2);
    }
}
