public class countingSort {
    public static void sort(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;++i){
            if(max<array[i]){
                max=array[i];
            }
        }

        int count[]=new int[max+1];
        int value=0;
        for(int i=0;i<array.length;++i){
             count[array[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;++i){
              while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }
       
        for(int i=0;i<array.length;++i)
        System.out.print(array[i]+" ");

    }
    public static void main(String[] args) {
        int array[]={1,4,1,3,2,4,3,7};
        sort(array);

    }
    
}
