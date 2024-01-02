public class spiral {
     public static void printmatrix(int matrix[][]){
       int endRow=matrix.length-1;
       int endCol=matrix[0].length-1;
       int startRow=0,startCol=0;
        System.out.println("matrix print");

        while(startRow<=endRow && startCol<= endCol){
            // to print top-startRow
            for(int i=startRow;i<=endCol;++i)
            System.out.print( matrix[startRow][i]+" ");

            // to print r-startCol
            for(int i=startRow+1;i<=endCol;++i)
               System.out.print( matrix[i][endRow]+" ");
            
            // to print bottom startRow
            if(startCol==endCol) return;
            for(int i=endCol-1;i>=startCol;--i)
               System.out.print( matrix[endRow][i]+" ");

            // to print left- startCol
            for(int i=endRow-1;i>startCol;--i)
               System.out.print( matrix[i][startCol]+" ");
           startRow++;
           startCol++;
           endRow--;
           endCol--;
        }

     }
    public static void main(String[] args) {
        base b=new base();
        int matrix[][]=base.inputArray();
        b.printArray(matrix);
        printmatrix(matrix);


        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    }
}
