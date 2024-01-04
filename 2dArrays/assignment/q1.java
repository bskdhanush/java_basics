public class q1 {
    public static void find(int matrix[][], int key){
        int n=matrix.length;
        int m=matrix[0].length;
        int value=0;
        
        for(int i=0; i<n;++i){  //O(n)
            for(int j=0;j<m;++j){  //O(n)
                 if(key==matrix[i][j]) ++value;
            }
        }
        System.out.println(value);

    }

     public static void main(String[] args) {
        int mateix[][]={{4,7,8},
                        {8,8,7}};
        find(mateix,7);
     }
}