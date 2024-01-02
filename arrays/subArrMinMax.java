public class subArrMinMax {
    public static void  subArrMinMax(int arr[]){
       int min=arr[0],max=Integer.MIN_VALUE,tmin=0,tmax=0;
       for(int i=0;i<arr.length;++i){
        int start=i;
        for(int j=i;j<arr.length;++j){
            int end=j;
            tmax=0;

            for(int k=start;k<=end;++k){
                //System.out.print(arr[k]);

                if(start==end){
                    tmin =arr[k];
                }

                tmax +=arr[k];
             }
             if(tmin<min) min=tmin;
             if(tmax > max) max=tmax;
            System.out.println();
        }
        System.out.println();
       }
System.out.println("Min :"+min+" Max :"+max);

    }
    public static void main(String[] args) {
     int arr[] = {1,-2,6,-1,3};
     subArrMinMax(arr);

    }
}
