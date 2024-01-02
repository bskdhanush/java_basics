import java.util.*;

public class sumOfEveOdd{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no of values you want to enter:");
        int n=in.nextInt();
        int even=0,odd=0,j;

        for(int i=0;i<n;i++){
        System.out.print("Enter "+ i +" number:");
        j=in.nextInt();
        if(j%2==0){
            even += j;
        }
        else
           odd +=j;

        }

        System.out.println("Sum of even:" +even +" Sum of odd:"+ odd);
        
    }
}