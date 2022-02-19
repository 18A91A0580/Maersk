package maps;
import java.util.*;
public class StudentDetails {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> hm=new HashMap<>();
        boolean check=true;
        while(check) {
            System.out.println("1.Insert Data\t2.Get Student Name \t3.Replace Name\t4.Print\t5.Exit");
            int n=sc.nextInt();
            switch(n) {
                case 1:
                case 3:
                    System.out.println("Enter id and name : ");
                    int id = sc.nextInt();
                    String s = sc.nextLine();
                    hm.put(id,s);
                    break;
                case 2:
                    System.out.println("Enter id:");
                    int k = sc.nextInt();
                    System.out.println("Student name is " + hm.get(k));
                    break;
                case 4:
                    for (Map.Entry<Integer,String> e : hm.entrySet()) {
                        System.out.print(e + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        //Itearting by using Iterator
//        Iterator itr=hm.entrySet().iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//        hm.clear();  // clears all the entries
//        hm.putIfAbsent(6,"six");  //inserts a value if key is not used
//        System.out.println(hm);
//        System.out.println(hm.containsKey(1)); //checks whether the key is present
//        System.out.println(hm.containsValue("seven")); //checks whether the value is present
//        hm.replace(1,"ONE","one"); //replaces value only if key is associated with old value
//        System.out.println(hm);
//        System.out.println(hm.keySet()); //returns key set
//        System.out.println(hm.values()); //returns value set
//        System.out.println(hm.entrySet()); //returns entry set
    }
}

