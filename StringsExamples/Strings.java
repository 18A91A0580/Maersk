package StringsExamples;
import java.util.*;
public class Strings {
    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = new String("ABC");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        //compareTo()
        //if s1==s2 returns 0, if s1>s2 returns +ve, if s2>s1 returns -ve
        System.out.println(s1.compareTo(s2));
        String patt = "[A-Z]{1,}";
        System.out.println(s1.matches(patt));// It checks the string with the pattern or regular expression
        String s3 = "Hi, how are you?";
        String s4 = "how";
        System.out.println(s3.contains(s4)); // checks s3 contains s4
        System.out.println(s3.startsWith("H"));
        System.out.println(s3.endsWith("ou?"));
        String s5 = "Hi Hello Hi Hello";
        System.out.println(s5.indexOf("Hi")); // returns the index of first letter of first occurence
        //returns the index of first letter of first occurence from the given index position
        System.out.println(s5.indexOf("Hi", 8));
        System.out.println(s5.lastIndexOf("Hi"));// returns the index of first letter of first occurence from last
        System.out.println(s5.charAt(9));
        System.out.println(s5.substring(9,11));
        String[] c=s5.split(" ");
        for(String e:c){
            System.out.println(e);
        }
        System.out.println(s5.replace("i","a"));
        String patt1="[A-Za-z0-9\\s]";
        System.out.println(s5.replaceAll(patt1,"&!"));
        int n=100;
        System.out.println(Integer.toString(n));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toOctalString(n));
        String a="100";
        String b="1100100";
        String C="64";
        String d="144";
        System.out.println(Integer.parseInt(a));
        System.out.println(Integer.parseInt(b,2));
        System.out.println(Integer.parseInt(C,16));
        System.out.println(Integer.parseInt(d,8));
    }
}