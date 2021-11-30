package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class Hash_Map {
    public static void main(String[] args){
        //key doesn't contain duplicates but values can
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        System.out.println(hm);
        System.out.println(hm.get(2)); //returns value associated with key
        System.out.println(hm.get(22)); //returns null if key is not existed
        System.out.println(hm.get("two")); //returns null
        hm.put(1,"ONE"); //replacing existing value
        System.out.println(hm);
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(4,"four");
        hm1.put(5,"five");
        hm.putAll(hm1);
        System.out.println(hm);
        hm1.clear();  // clears all the entries
        hm.putIfAbsent(6,"six");  //inserts a value if key is not used
        System.out.println(hm);
        System.out.println(hm.containsKey(1)); //checks whether the key is present
        System.out.println(hm.containsValue("seven")); //checks whether the value is present
        hm.replace(1,"ONE","one"); //replaces value only if key is associated with old value
        System.out.println(hm);
        System.out.println(hm.keySet()); //returns key set
        System.out.println(hm.values()); //returns value set
        System.out.println(hm.entrySet()); //returns entry set

        //Iterating by using enhanced for loop
        for(Entry<Integer,String> e:hm.entrySet()){
            e.setValue(e.getValue()+" 1");
        }
        System.out.println(hm);

        //Itearting by using Iterator
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}

