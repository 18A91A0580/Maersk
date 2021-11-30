package exceptions;
import java.util.*;
class VoterAgeException extends Exception{
    VoterAgeException(){
        super("Age should be greater than 18");
    }
}
public class UserDefinedException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age :");
        try{
            int age;
            age=sc.nextInt();
            if(age<18) throw new VoterAgeException();
            System.out.println("Age is Valid");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
