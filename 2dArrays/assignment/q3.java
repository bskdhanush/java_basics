
public class q3 {
    public static void printMatrix(int array [][]){
        int n=array.length;
        int m=array[0].length;
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j ){
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
    }

    
    public static void Transposre(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int Tmatrix[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Tmatrix[j][i]=matrix[i][j];
            }
        }
        System.out.println("Before Transpose: ");
        printMatrix(matrix);
        System.out.println("After Transpose: ");
        printMatrix(Tmatrix);
        
    }
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},{11,4,3}} ;
        Transposre(matrix);
    }
    
}
