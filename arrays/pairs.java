public class pairs {
   public static void findPairs(int arr[]){
      int i=0;
      while (i<arr.length-1) {
       for(int j=i+1;j<arr.length;++j){
         System.out.print("("+arr[i]+","+arr[j]+") ");
        }
        ++i;
   
      }  
      
   }
    public static void main(String[] args) {
       int arr[]= {2,4,6,8,10};
       findPairs(arr);
    }
    
}
