public class maxUsingPrefix {
    public static void maxPrifix(int arr[]){
        int prefixArray[]=new int[arr.length];
        int sum=Integer.MIN_VALUE,Smax=Integer.MIN_VALUE;

        prefixArray[0]=arr[0];
           for(int j=1;j<arr.length;++j){
               prefixArray[j]=prefixArray[j-1]+arr[j];
           }
          

        for(int i=0;i<arr.length;++i){
        int start=i;
        for(int j=i;j<arr.length;++j){
            int end=j;
            sum= start==0?prefixArray[end]:prefixArray[end]-prefixArray[start-1];

            if(Smax<sum) Smax=sum;

        }

      }
      System.out.println(Smax);
    }
    public static void main(String[] args) {
         int arr[]={1,-2,6,-1,3};
         maxPrifix(arr);
    }
}
