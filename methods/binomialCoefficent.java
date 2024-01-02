
import java.util.*;


public class binomialCoefficent {


   public static float bin_conf_calc(int n,int r,int x){



    return n/(r*x);

    }
    public static void main(String [] args ){
        Scanner in=new Scanner(System.in);

        factorial fact=new factorial();
        //int n=fact.factorial_cala(5);
        
        System.out.print("Enter the N,R values:");
        int n=in.nextInt();
        int r=in.nextInt();
        int x=n-r;


        n=fact.factorial_cala(n);
        r=fact.factorial_cala(r);
        x=fact.factorial_cala(x);
         System.out.println(bin_conf_calc(n,r,x));
        
        //System.out.println("Factorial of "+" is: "+n);
    }
}


