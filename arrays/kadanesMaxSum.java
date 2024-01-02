public class kadanesMaxSum {
    public static void algo(int arr[]){
        int cSum=0,maxSum=0;
        for(int i=0;i<arr.length;++i){
            cSum +=arr[i];
            if(cSum<0){
                cSum=0;
            }
            /*if(cSum>maxSum){
                maxSum=cSum;
            }*/
            maxSum=Math.max(cSum,maxSum
            );
        }
        System.out.println(maxSum);
    }
    public static void main(String [] args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        algo(arr);
    }
}
