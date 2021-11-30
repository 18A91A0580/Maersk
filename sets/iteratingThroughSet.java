package sets;
import java.util.HashSet;
import java.util.Iterator;
public class iteratingThroughSet {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(200);
        hs.add(2);
        hs.add(100);
        hs.add(3);
        for(int e:hs){
            System.out.print(e+" ");
        }
        System.out.println();
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
