package bitManipulation.assignment;

public class q2 {
    public static void swap(int a,int b){
        while(b>0){

            b=b>>1;
            System.out.print(b+" ");
        }

    }
    public static void main(String[] args) {
        swap(3,4);
    }
    
}
