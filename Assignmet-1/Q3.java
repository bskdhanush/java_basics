import java.util.*;

public class Q3{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);

       
        
        System.out.print("Cost of pencile :");
        float cPencile=in.nextFloat();
        System.out.print("Cost of pen :");
        float cPen=in.nextFloat();
        System.out.print("Cost of eraser :");
        float cEraser=in.nextFloat();

        float totalCost= (cPen+cPencile+cEraser)+(((cPen+cPencile+cEraser)*18)/100);
    
        System.out.println("Toatal cost after gst: "+ totalCost);
    }
}