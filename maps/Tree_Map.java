package maps;
import java.util.*;
public class Tree_Map {
    public static void main(String[] args){
        // It is implemented based on red-black tree
        // It is sorted by keys
        TreeMap<Character,Integer> tm=new TreeMap<>();
        tm.put('c',3);
        tm.put('a',1);
        tm.put('b',2);
        System.out.println(tm);
        System.out.println(tm.firstEntry());    //returns first entry after sorting
        System.out.println(tm.lastEntry());     //returns last entry after sorting
        System.out.println(tm.firstKey());     //returns first key after sorting
        System.out.println(tm.lastKey());      // returns last key after sorting
        System.out.println(tm.pollFirstEntry()); //returns first entry and removes it, after sorting
        System.out.println(tm.pollLastEntry()); //returns last entry and removes it, after sorting
        System.out.println(tm);
    }
}
