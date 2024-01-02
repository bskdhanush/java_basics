import java.util.*;

public class incomeTaxCalc{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter your Income:");
        int Income=in.nextInt();

        if( Income<500000){
            System.out.println("Post tax your income: "+Income);
        }
        
        else if(Income>=500000 && Income<= 1000000){
            Income= Income- (Income*20)/100;
            System.out.println("Post tax income: "+Income);
        }

        else{
            Income= Income- (Income*30)/100;
            System.out.println("Post tax income: "+Income);
        }
        
   }
}