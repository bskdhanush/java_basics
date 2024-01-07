package bitManipulation.assignment;

public class q1 {
    public static void calcExpo(int a/*exponent*/){
        int ans=1;
        int n=a;
        while (n>0) {
            if( (n&1)!=0) ans=ans*a;
            a=a*a;
            n=n>>1;
        }
        System .out.println(ans);
    }
    public static void main(String[] args) {
            calcExpo(2);
    }
    
}
