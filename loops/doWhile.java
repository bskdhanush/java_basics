import java.util.*;
public class doWhile{
    public static void main(String [] args){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       
       do{

          int last=n%10;
          System.out.print(last);
          n=n/10;

         }  while(n>0);
        
    }
}
       