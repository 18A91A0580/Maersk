package maps;
import java.util.*;
public class hashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> hm=new HashMap<>();
        boolean check=true;
        while(check) {
                System.out.println("1.Insert\t 2.Get Student name \t 3.Replace name\t 4.Print\t 5.Exit");
            int n=sc.nextInt();
            switch(n) {
                case 1:
                case 3:
                    System.out.println("Enter id and name : ");
                    int id = sc.nextInt();
                    String s = sc.next();
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
    }
}
