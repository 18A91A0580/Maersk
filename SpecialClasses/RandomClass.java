package SpecialClasses;
import java.util.Random;
public class RandomClass {
    public static void main(String[] args){
        Random r=new Random();
        System.out.println(r.nextInt(100)); //prints a random number where 0<=number<=100
        System.out.println(r.nextInt(9000)+1000); //prints a random namber where 1000<=number<=10000
        //by using Math class
        System.out.println((int)(Math.random()*10));// prints a random number from 0 to 10
        System.out.println((int)(Math.random()*4000)+1000); //prints a random number from 1000 to 5000
    }
}
