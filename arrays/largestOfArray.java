public class largestOfArray {
    public static int search(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,45,30,8,9,47,10,20};
       int out= search(arr);
       System.out.println(out);
    }
}
