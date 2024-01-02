import java.util.*;

public class maxOf3Numbers {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+ "a is greatar");
            }
        }
            else if(b>c){
                System.out.println(b+ "b is greatar");
            }
        
        
        else {
                System.out.println(c+ "c is greatar");
        }

        
 }    
    
}

