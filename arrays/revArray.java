public class revArray {
    public static void reverse(int arr[]){
        // swapping the array
        int start=0,end=arr.length-1;
        while (true) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            if(start==end){
                break;
            }
            else {
                start++;
                end--;
            }
        }
        for (int i=0;i<arr.length;++i) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
       int arr[]= {1,2,3,4,5,6,7};
       reverse(arr);
    }
    
}
