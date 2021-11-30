package SpecialClasses;
import java.util.*;
public class ScannerClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println(s);
        String temp="";
        for(int i=0;i<s.length();i++){
            temp=s.charAt(i)+temp;
        }
        System.out.println("reversed string: "+temp);
    }
}
