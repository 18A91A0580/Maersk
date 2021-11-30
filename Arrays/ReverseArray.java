package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5};
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
