import java.util.Scanner;

public class diagonalSum {
    
    static base b=new base();
    public static void calcDigSum(int matrix[][]){
        int noOfRows=matrix.length-1;
        int noOfCols=matrix[0].length-1;    
        int primaryDiagonal=0,secondaryDiagonal=0 ,totalSum=0;
        if(noOfRows== noOfCols){
            for(int i=0;i<=noOfRows;++i){
               primaryDiagonal +=matrix[i][i];
               secondaryDiagonal +=matrix[i][noOfRows-i];

               // we can also use single vairale 
            }
             totalSum=primaryDiagonal+secondaryDiagonal;
            if(noOfRows/2 != 0 ){
                int temp=noOfRows/2;
                //System.out.println(temp);
                totalSum =totalSum-matrix[temp][temp];

            }
            
            

            System.out.println("Total Diagonal sum: "+totalSum);


        }
              


    }
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        //System.out.print("Enter size of matrix: ");
        //int n=in.nextInt();
        int matrix[][]=b.inputArray(4 /*n*/);
        calcDigSum(matrix);
          

        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    }
}
