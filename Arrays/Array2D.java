package Arrays;

public class Array2D {
    public static void main(String[] args){
        int[][] a={
                {1,2,3},
                {2,4},
                {2,2,3,4,5}
        };
        System.out.println(a.length);
        System.out.println(a[2].length);
        for(int[] e:a){
            for(int j:e){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
