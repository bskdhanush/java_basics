public class selectionSort {
    public static void sort(int arry[]){
        for(int i=0;i<arry.length-1;++i){
            int minpos=i;
           for(int j=i+1;j<arry.length;++j){
               if(arry[j]<arry[minpos]){
                minpos =j;
               }
           }
           int temp=arry[minpos];
             arry[minpos]=arry[i];
             arry[i]=temp;
        }
        for(int i=0;i<arry.length;++i)
        System.out.print(arry[i]+" ");


    }
    public static void main(String[] args) {
        int array[]= {5,4,1,3,2};
        sort(array);
    }
    
}
