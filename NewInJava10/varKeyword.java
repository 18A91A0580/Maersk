package NewInJava10;
import java.util.*;
public class varKeyword {
    //we cannot use var at class level
    // var A=10  cannot be done
    public static void main(String[] args){
        int a=10;
        var b=10;
        System.out.println(b);
        var c=1.2;
        var s="ABC";
        System.out.println(c);
        System.out.println(s);
        var o=add(1,2);
        System.out.println(o);
//        Scanner sc=new Scanner(System.in);
        var scc=new Scanner(System.in);
//        int[] arr=new int[5];
        var arr=new int[5];
        System.out.println(arr[0]);
        //int[] brr={1,2,3};
        //var brr={1,2,3}  we cannot do this
    }
    //we cannot use var with parameters and signatures
    static int add(int a,int b){
        return a+b;
    }
}
