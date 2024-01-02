import java.util.*;

public class switch_calc{

    
public static void Operation(int num1,int num2,String operator) {
     
     switch(operator) {

        case "+":  System.out.println(num1+ num2);
        break;

        case "-" : System.out.println(num1 - num2);
        break;

        case "/" : System.out.println(num1 / num2);
        break;

         case "*" : System.out.println(num1 * num2);
        break;

        default : System.out.println("we are in default statment");

     }
}

    public static void main(String [] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter operator:");
        String operator= in.nextLine();
        System.out.print("Enter first number:");
        int num1= in.nextInt();
        System.out.print("Enter Second number:");
        int num2= in.nextInt();
        System.out.print("Operation:");
        Operation(num1,num2,operator);
    }
}