package Arrays;

public class ObjectArray {
    public static void main(String[] args){
        Object[] a={1,'c',2.5f,22.30,"String"};
        for(Object e:a){
            System.out.print(e+" ");
        }
        System.out.println();
        Object[][] b={
                {1,2.2f,'c'},
                {"st",true}
        };
        for(Object[] e:b){
            for(Object j:e){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
