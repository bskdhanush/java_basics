public class binarySearch {

    public static int sort(int arr[],int key){

        int start=0, end=arr.length-1;
        
        while (start<=end) {
            int mid =(start+end)/2;

            if(arr[mid]== key){
                return mid;
            }

            if (arr[mid]<key) {
                start =mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
       
      
    }
    public static void main(String[] args) {
       int arr[]={2,5,6,8,9,10,14,15,16};
       int key=15;
       int value=sort(arr,key);
       System.out.println(value);
       
    }
    
}
