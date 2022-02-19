package streamAPIs;
interface Calculator{
    void add(int n1,int n2);
}
class Calc{
    public static void addition(int n1,int n2){   //static method
        System.out.println("Addition is "+(n1+n2));
    }
    public void adds(int n1,int n2){             //non-static method
        System.out.println("Addition is "+(n1+n2));
    }
}
interface Messenger{
    public void getMessage(String s);
}
class Message {
    Message(String s){
        System.out.println("Hi "+s);
    }
}
public class LambdaMethodReferences {
    public static void main(String[] args) {
        //1.Reference to static method
//        Calculator cRef=Calc::addition;
//        cRef.add(1,2);
        //2.Reference to non-static method
        Calc c=new Calc();
        Calculator cRef=c::adds;
        cRef.add(1,2);
        //3.Reference to a constructor
        Messenger mRef=Message::new;
        mRef.getMessage("Deva");
    }

}
