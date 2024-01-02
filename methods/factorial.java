import java.util.*;
public class factorial {

    public int factorial_cala(int value){
         int i;

        if(value==0) return 1;
        else{
           
        for(i=1;value>=1; --value){
            i *=value;
        }
    }
        return i;
    } 
   /*  public static void main(String [] args ){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the Number:");
        int value=in.nextInt();
        int fact=factorial_cala(value);

        System.out.println("Factorial of "+value+" is: "+fact);
    }*/
}
