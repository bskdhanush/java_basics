import java.util.*;
public class Rev_num{
    public static void main(String [] args){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
        int last,rev=0;
       while(n>0){
          last=n%10;
          rev=(10*rev)+last;
          n=n/10;
       }

       System.out.println(rev);
        
    }
}
       