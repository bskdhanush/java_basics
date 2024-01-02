public class bubbleSort {
    public static void sort(int array[]){
        for(int i=0;i<array.length;++i){
            for(int j=0;j<(array.length-i-1);++j){
             if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
             }
            }
        }
        for(int i=0;i<array.length;++i)
            System.out.print(array[i]+" ");

    }
    public static void main(String[] args) {
        int array[]={5,4,1,2,3};    
        sort(array);
    }
}
