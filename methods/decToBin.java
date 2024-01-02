public class decToBin {
    public static void dectobin(int number){
        int pow=0,binNum=0;
        
        for(int i=0; number!=0 ;i++,pow++){
            int reminder=number%2;
            binNum= binNum+(reminder*(int)Math.pow(10, pow));
            number =number/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
       dectobin(149);
       //System.out.println(10%2);
 

    }
}
