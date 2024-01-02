import java.util.*;
public class printRev_number{
    public static void main(String [] args){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       
       while(n>0){

          int last=n%10;
          System.out.print(last);
          n=n/10;
      
          
       }
        
    }
}
       