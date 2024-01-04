public class q2 {
    public static void findSum(int matrix[][], int row){
        int n=matrix.length;
        int sum=0;
        for(int j=0;j<n;++j){
            //System.out.println(matrix[row][j]);
            sum +=matrix[row-1][j];
        }
        System.out.println(sum);
    } 
    public static void main(String[] args) {
        int mateix[][]={{1,4,9},{11,4,3},{2,2,3}} ;
        findSum(mateix,2);
   } 
}
