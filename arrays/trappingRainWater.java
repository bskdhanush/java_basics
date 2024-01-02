public class trappingRainWater {
    public  static void calcTrappedWater(int height[],int width){
        int bound,Twater=0;
        for(int i=0;i<height.length;++i){
            /*if(i==0 || i<arr.length){
                continue;
            } */   
            if(i!=0){
                int left=i,right=i,lmax=Integer.MIN_VALUE,rmax=Integer.MIN_VALUE;
                while (left>=0 ) {
                  lmax=Math.max(lmax,height[left]);
                  --left;
                  //System.out.println("in loop");  
                }
                //System.out.println(lmax);
                while (right<height.length) {
                    rmax=Math.max(rmax, height[right]);
                    ++right;
                }

                bound=Math.min(lmax,rmax);
                if(bound-height[i]>0){
                    Twater += (bound-height[i])*width;
                }
                else{
                    Twater +=0;
                }
             
            }
            
        }

        System.out.println(Twater);
    }
    public static void main(String [] args){
        int arr[]={4, 2, 0, 3, 2, 5};
        //System.out.println(arr.length);
        calcTrappedWater(arr,1);
    }
    
}
