public class Diamond {
    public static void pattern(int n){
        for(int i=0;i<n;++i){

            for(int j=1;j<=n-(i+1);++j)
               System.out.print(" ");

            for(int k=1;k<=(i*2)+1;++k)
                 System.out.print("*"); 
            
            for(int j=1;j<=n-(i+1);++j)
               System.out.print(" ");

          System.out.println();

        }



        for(int i=n-1;i>=0;--i){

            for(int j=1;j<=n-(i+1);++j)
               System.out.print(" ");

            for(int k=1;k<=(i*2)+1;++k)
                 System.out.print("*"); 
            
            for(int j=1;j<=n-(i+1);++j)
               System.out.print(" ");

          System.out.println();

        }

    }
    public static void main(String[] args) {
        pattern(4);
    }
}
