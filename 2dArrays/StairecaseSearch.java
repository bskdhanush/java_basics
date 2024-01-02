// Matrix should be sorted in row and colume 
public class StairecaseSearch {
    static base b=new base();
    public static void stairsearch(int matrix[][],int key){
        int pointer=matrix.length-1,i=0;
            while (i<matrix.length  && pointer>=0) {
             if(matrix[i][pointer]==key){
                System.out.println("key Found");
                return;
             }
              else if(matrix[i][pointer]>key){ 
                pointer--;
              }
              else ++i;
             
            
            }
            System.out.print("key not found"); 
        }

    public static void main(String[] args) {
        int matrix[][]=b.inputArray(4);
        stairsearch(matrix, 33/*key value*/);
        //10 20 30 40 15 25 35 45 27 29 37 48 32 33 39 50
    }
    
}
