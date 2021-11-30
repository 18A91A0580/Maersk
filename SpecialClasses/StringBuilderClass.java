package SpecialClasses;

public class StringBuilderClass {
    public static void main(String[] args){
        String s1="I";
        s1+=" like";
        s1+=" java";
        //Here 5 string objects are created
        //They are I, like, java, I like, I like java
        System.out.println(s1);
        //To avoid this we use StringBuilder class
        //Which can be used create mutable strings
        StringBuilder s= new StringBuilder("I");
        s.append(" like");
        s.append(" java");
        System.out.println(s);
        s.replace(2,6,"love");
        System.out.println(s);
        s.insert(11," programming");
        System.out.println(s);
        s.deleteCharAt(0);
        System.out.println(s);
        s.delete(0,6);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
