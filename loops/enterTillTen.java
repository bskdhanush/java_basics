import java.util.*;
public class enterTillTen{
    public static void main(String [] args){
       Scanner in= new Scanner(System.in);

      /* for(int i=0;i==i;i++){
        System.out.print("Enter a number:");
          int y= in.nextInt();
          if(y== 10) break;
          System.out.println(y);
       }
    System.out.print("out of loop");
    */


   // using do while 
 
   do{
       System.out.print("Enter a number:");
         int y= in.nextInt();
          if(y%10 == 0) break;
          System.out.println(y);
   }
   while(true);


    
    }
}