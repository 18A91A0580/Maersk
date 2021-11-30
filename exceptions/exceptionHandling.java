package exceptions;

public class exceptionHandling {
    public static void main(String[] args){
        try{
            System.out.println(2/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("After exception handling");
        }
        finally{
            System.out.println("Executes whether the exception is handled or not");
        }



    }

}
