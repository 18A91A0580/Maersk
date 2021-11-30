package Arrays;
import javax.sound.midi.Soundbank;
import java.util.*;
public class Array1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        System.out.println("Enter 3 elements : ");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        for(int e:a){
            System.out.print(e+" ");
        }
        System.out.println();
        for(int e:b){
            System.out.print(e+" ");
        }
    }
}

