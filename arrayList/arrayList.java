package arrayList;
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2);
        System.out.println(al);
        System.out.println(al.get(1)); //returns element at particular index
        System.out.println(al.indexOf(2)); //first occurence from start
        System.out.println(al.lastIndexOf(2)); //first occurence from end
//        al.clear();
//        System.out.println("After clearing the list:"+al);
        System.out.println(al.contains(4)); //returns boolean
        ArrayList<Integer> bl=new ArrayList<>();
        bl.add(1);
        bl.add(4);
        System.out.println(bl);
        System.out.println(al.containsAll(bl)); //checks all the elements in bl contains in al
        System.out.println(al.subList(2,3));  //returns sub list
        System.out.println(al.addAll(bl));   //It will append bl to al
        System.out.println(al);
        Collections.sort(al);  // It will sort the list in ascending order
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        ArrayList<String> cl=new ArrayList<>();
        cl.add("AB");
        cl.add("CD");
        cl.add("EF");
        cl.add("AB");
        cl.add("GH");
        cl.remove(1); // remove by using index
        cl.remove("AB"); // remove by using object ,removes only the first occurrence
        cl.set(2,"IJ"); //we can change value at particular index
        System.out.println(cl);
        System.out.println(cl.size()); //returns size of the list
        System.out.println(cl.isEmpty()); //checks whether the list is empty or not
        // Iterating through list
        for(String e:cl) System.out.print(e+" ");
        System.out.println();
        Object[] st=cl.toArray();
        for(Object e:st){
            System.out.print(e+" ");
        }
    }
}
