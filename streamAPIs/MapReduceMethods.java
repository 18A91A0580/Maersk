package streamAPIs;
import java.util.*;
public class MapReduceMethods {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6);


//        int res=0;
//        for(int e:l){
//            res=res+e*2;
//        }
//        System.out.println(res);

        System.out.println(l.stream().map(i->i*2).reduce(0,(c,e)->c+e));
    }
}
