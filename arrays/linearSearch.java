public class linearSearch {

    public static int linearS(int arr[], int key){
         for (int i=0;i<arr.length;++i) {
           if( arr[i]==key) return i;
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,45,30,8,9,47,10,20};
        int key=10;
       int out= linearS(arr,key);
       System.out.println(out);
    }
}
