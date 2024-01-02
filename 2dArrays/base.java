import java.util.*;
public class base {
  
    public static void printArray(int array [][]){
        int n=array.length;
        int m=array[0].length;
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j ){
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
    }

    

        public static int[][] inputArray(int size){
            Scanner in=new Scanner(System.in);
            int array[][]=new int[size][size];
          // To take input of array
            System.out.println("Enter values: ");
            for(int i=0;i<size;++i){
              for(int j=0;j<size;++j ){
                array[i][j]=in.nextInt();
            }

           }
           return array;
        }

    public static void main(String[] args) {
        
        //inputArray();
        //printArray();
    }
}
