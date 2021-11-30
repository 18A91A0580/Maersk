package Arrays;
public class Array2DTables {
    public static void main(String[] args){
        int[][] a=new int[5][10];
        int n=2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=n*(j+1);
                System.out.print(a[i][j]+" ");
            }
            n++;
            System.out.println();
        }
    }
}
